package util;

import model.bank.Account;

public interface Transactions {
	
	void deposit(Double ammount);
	
	void withdraw(Double ammount);
	
	void transfer(Double ammount, Account account);

}
