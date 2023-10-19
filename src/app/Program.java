package app;

//TODO refatorar o código para evitar repetições e desenvolver uma lógica para efetuar transações. Reavaliar uso da Interface Transactions

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.bank.Account;
import model.bank.Bank;
import util.CreateAccount;
import util.Menu;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Integer condition;
		Account account;
		Bank dioBank = new Bank();

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
					case 4:
						dioBank.listAccounts();
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
