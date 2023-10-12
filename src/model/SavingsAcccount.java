package model;

public class SavingsAcccount extends Account {

	public SavingsAcccount(Client client) {
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

}
