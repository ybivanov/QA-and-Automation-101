package com.hackbulgaria.week2.tdd;

import java.util.Currency;

import javax.transaction.InvalidTransactionException;

public interface BankAccount {
	public Currency getCurrency();
	public Integer getBalance();
	public void deposit(Integer amount);
	public void withdraw(Integer amount) throws NotEnoughMoney;
}
