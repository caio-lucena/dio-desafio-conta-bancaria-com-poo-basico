package model.bank;

import model.client.Client;
import util.BankStatement;
import util.Transactions;

public abstract class Account implements Transactions, BankStatement{
	
	private static final Integer BANK_BRANCH = 1;
	private static Integer counter = 1;
	
	private Integer bankBranch;
	private Integer accountNumber;
	protected double balance;
	private Client client;
	
	public Account(Client client) {
		this.bankBranch = BANK_BRANCH;
		this.accountNumber = counter;
		this.client = client;
		
		counter++;
	}
	
	@Override
	public void deposit(Double ammount) {
		this.balance += ammount;
		
	}

	@Override
	public abstract void withdraw(Double ammount);

	@Override
	public void transfer(Double ammount, Account account) {
		this.withdraw(ammount);
		account.deposit(ammount);
	}
	

	public Integer getBankBranch() {
		return bankBranch;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public static Integer getCounter() {
		return counter;
	}

	public Client getClient() {
		return client;
	}

}
