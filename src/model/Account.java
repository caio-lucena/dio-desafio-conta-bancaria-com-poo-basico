package model;

import util.Transactions;

public abstract class Account implements Transactions{
	
	private static final Integer BANK_BRANCH = 1;
	private static Integer counter = 1;
	
	private Integer bankBranch;
	private Integer accountNumber;
	private Double balance;
	private Client client;
	
	public Account(Integer accountNumber, Client client) {
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
	public void withdraw(Double ammount) {
		
		String ammountString = String.format("%.2f", ammount);
		
		if (ammount > this.balance) {
			System.out.println("Não há saldo suficiente na conta para realizar esta operação de R$ " + ammountString);
		}
		else {
			this.balance -= ammount;
		}
		
	}

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
