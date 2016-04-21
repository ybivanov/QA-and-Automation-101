package com.hackbulgaria.week2.tdd;

import java.util.Currency;

public class BankAccountImpl implements BankAccount {

	private int currentBalance;

	public BankAccountImpl() {
		this(0);
	}
	
	public BankAccountImpl(int initialAmount) {
		this.currentBalance = initialAmount;
	}
	
	@Override
	public Currency getCurrency() {
		return Currency.getInstance("BGN");
	}

	@Override
	public Integer getBalance() {
		return currentBalance;
	}

	@Override
	public void deposit(Integer amount) {
		currentBalance += amount;
	}

	@Override
	public void withdraw(Integer amount) throws NotEnoughMoney {
		if(currentBalance - amount < 0) {
			throw new NotEnoughMoney();
		}
		
		currentBalance -= amount;
	}

}
