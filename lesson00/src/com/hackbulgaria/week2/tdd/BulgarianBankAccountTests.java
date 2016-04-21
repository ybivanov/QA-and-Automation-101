package com.hackbulgaria.week2.tdd;

import static org.junit.Assert.*;

import java.util.Currency;

import org.junit.Before;
import org.junit.Test;

public class BulgarianBankAccountTests {
	
	private BankAccount zeroAccount;
	private BankAccount hundredAccount;

	@Before
	public void setUp() {
		BankAccount zeroAccount = new BankAccountImpl();
		this.zeroAccount = zeroAccount;
		
		BankAccount hundredAccount = new BankAccountImpl(100);
		this.hundredAccount = hundredAccount;
	}
	
	@Test
	public void testWhenCreatingNewAccountBalanceShouldBeZero() {
		assertEquals(new Integer(0), zeroAccount.getBalance());
	}
	
	@Test
	public void testWhenCreatingNewAccountWithInitialBalanceThatBalanceCheckHolds() {		
		assertEquals(new Integer(100), hundredAccount.getBalance());
	}
	
	@Test
	public void testThatInBulgarianBankAccountCurrencyIsBgn() {
		//		factory pattern
		Currency bgn = Currency.getInstance("BGN");
		
		assertEquals(bgn, zeroAccount.getCurrency());
	}
	
	@Test
	public void testThatIfWeDepositInNewAccountBalanceShouldBeTheDepositedAmount() {
		zeroAccount.deposit(100);
		
		assertEquals(new Integer(100), zeroAccount.getBalance());
	}

	@Test
	public void testThatIfWeDepositInBankAccountWithInitialBalanceTheBalanceShouldBeSummed() {
		
		hundredAccount.deposit(100);
		
		assertEquals(new Integer(200), hundredAccount.getBalance());
	}
	
	@Test
	public void testWithdrawingFromBankAccountWithEnoughInitialBalance() {
		try {
			hundredAccount.withdraw(20);
		} catch (NotEnoughMoney e) {
			fail("Should not be here - exception thrown when it's not needed.");
		}
		
		assertEquals(new Integer(80), hundredAccount.getBalance());
	}
	
	@Test
	public void testWhenWeEmptyTheBankAccountBalanceShouldBeZero() {
		try {
			hundredAccount.withdraw(100);
		} catch (NotEnoughMoney e) {
			fail("Should not be here - exception thrown when it's not needed.");
		}
		
		assertEquals(new Integer(0), hundredAccount.getBalance());
	}
	
	@Test
	public void testWithdrawingMoreMoneyThanActualBalanceShouldThrowExpcetion() {
		boolean inCatch = false;
		try {
			hundredAccount.withdraw(200);
			fail("Should not be here - exception should have been raised.");
		} catch (NotEnoughMoney e) {
			inCatch = true;
		} finally {
			assertEquals(true, inCatch);
			assertEquals(new Integer(100), hundredAccount.getBalance());
		}
	}
	
	@Test
	public void testWithdrawingNegativeAmountOfMoneyShouldThrowInvalidOperation() {
		boolean inCatch = false;
		try {
			hundredAccount.withdraw(200);
			fail("Should not be here - exception should have been raised.");
		} catch (NotEnoughMoney e) {
			inCatch = true;
		} finally {
			assertEquals(true, inCatch);
			assertEquals(new Integer(100), hundredAccount.getBalance());
		}
	}
}
