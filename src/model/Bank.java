package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Account> accountList = new ArrayList<Account>();
	
	public Bank() {}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void removeAccount(Account account) {
		accountList.remove(account);
	}
	
	public void listAccounts() {
						
		accountList.forEach(x ->{
			x.printBankStatement();
		});
	}

}
