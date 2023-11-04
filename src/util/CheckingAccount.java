package util;

import model.bank.Account;
import model.client.Client;

public class CheckingAccount extends Account{

	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public void printBankStatement() {
		
		System.out.println("***********");
		
		System.out.println("Cliente: " + super.getClient().getName());
		System.out.println("Tipo Cliente: " + super.getClient().getType().getClientTypeFullName());
		System.out.println("Agência: " + super.getBankBranch());
		System.out.println("Conta: " + super.getAccountNumber());
		System.out.printf("Saldo R$ %.2f%n", super.getBalance());
		
		System.out.println("***********");
		
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

}
