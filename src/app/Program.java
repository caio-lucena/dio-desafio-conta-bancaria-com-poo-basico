package app;

//TODO refatorar o código para evitar repetições

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.Account;
import model.Address;
import model.CheckingAccount;
import model.Client;
import model.SavingsAcccount;
import model.enums.ClientType;
import util.ValidateAccountType;
import util.ValidateClientType;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String name, address, clientType, accountType;
		Integer addressNumber;
		Address fullAdress;
		Client client;
		Account account;
		
		boolean conditionClientType;
		boolean conditionAccountType;
		
		try {
			
			System.out.print("Por favor informe seu nome: ");
			name = scanner.nextLine();
			
			System.out.print("Agora informe o logradouro do seu endereço: ");
			address = scanner.nextLine();
			
			System.out.print("Informe o número do seu endereço: ");
			addressNumber = scanner.nextInt();
			
			System.out.print("Agora informe se você é Pessoa Física ou Jurídica (digite PF/ PJ): ");
			clientType = scanner.nextLine();
			
			conditionClientType = ValidateClientType.validateClientType(clientType);
			
			while (!conditionClientType) {
				System.out.print("Favor informar o tipo de cliente. Digite PF para Pessoa Física e PJ para Pessoa Jurídica: ");
				clientType = scanner.nextLine();
				conditionClientType = ValidateClientType.validateClientType(clientType);
			}
			
			fullAdress = new Address(address, addressNumber);
			
			if (clientType.equalsIgnoreCase("PF")) {
				client = new Client(name, fullAdress, ClientType.PESSOA_FISICA);
			}
			else {
				client = new Client(name, fullAdress, ClientType.PESSOA_JURIDICA);
			}
			
			System.out.println("Informe se é Conta Corrente, ou Conta Poupança");
			System.out.print("Digite CC ou CP, respectivamente: ");
			accountType = scanner.nextLine();
			
			conditionAccountType = ValidateAccountType.validateAccountType(accountType);
			
			while (!conditionAccountType) {
				System.out.print("Favor informar o tipo de conta, Digite CC para Conta Corrente ou CP para Conta Poupança: ");
				accountType = scanner.nextLine();
				conditionAccountType = ValidateAccountType.validateAccountType(accountType);
			}
			
			if (accountType.equalsIgnoreCase("CC")) {
				account = new CheckingAccount(client);
			}
			else {
				account = new SavingsAcccount(client);
			}
			
			account.printBankStatement();
			

		}
		catch(InputMismatchException | IllegalArgumentException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
