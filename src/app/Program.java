package app;

//TODO fazer tratamento de excessões e validações de regras de negócio

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.bank.Account;
import model.bank.Bank;
import util.implementation.CreateAccount;
import util.implementation.Menu;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Integer condition;
		Account account;
		Bank dioBank = new Bank();
		
		Integer accountNumber;
		Double depositAmmount;
		Double withdrawAmmount;
		Double transferAmmount;

		try {					
			
			do {
				
				Menu.showMenu();
				
				System.out.print("Opção: ");
				
				condition = scanner.nextInt();
				
				switch (condition) {
				
					case 1:
						account = CreateAccount.createAccount();
						dioBank.addAccount(account);
						break;
					case 2:
						System.out.print("Por favor informe o número da conta a receber o depósito: ");
						accountNumber = scanner.nextInt();
						System.out.print("Agora o informe o valor para depósito: ");
						depositAmmount = scanner.nextDouble();
						account = dioBank.getAccountByNumber(accountNumber);
						account.deposit(depositAmmount);
						
						break;
					case 3:
						System.out.print("Favor informe o número da conta para ser sacada: ");
						accountNumber = scanner.nextInt();
						System.out.print("Agora informe o valor para ser sacado: ");
						withdrawAmmount = scanner.nextDouble();
						account = dioBank.getAccountByNumber(accountNumber);
						account.withdraw(withdrawAmmount);
						break;
					case 4:
						System.out.print("Informe o número da conta que fará o despósito: ");
						Integer accountNumberWithdraw = scanner.nextInt();
						System.out.print("Agora informe o número da conta de destino: ");
						Integer accountNumberDeposit = scanner.nextInt();
						System.out.print("Informe o montante a ser depositado: ");
						transferAmmount = scanner.nextDouble();
						
						Account withdrawAccount = dioBank.getAccountByNumber(accountNumberWithdraw);
						Account depositAccount = dioBank.getAccountByNumber(accountNumberDeposit);
						
						withdrawAccount.transfer(transferAmmount, depositAccount);
						
						break;						
					case 5:
						dioBank.listAccounts();
						break;
					case 6:
						System.exit(0);
					default:
						System.out.println("Favor selecionar uma opção válida");
						break;
					
				}
								
			}
			while(condition != 0);	

		}
		catch(InputMismatchException | IllegalArgumentException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
