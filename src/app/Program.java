package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.Address;
import model.Client;
import model.enums.ClientType;
import util.ValidateClientType;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String name, address, clientType;
		Integer addressNumber;
		Address fullAdress;
		Client client;		
		
		boolean condition;
		
		try {
			
			System.out.print("Por favor informe seu nome: ");
			name = scanner.nextLine();
			
			System.out.print("Agora informe o logradouro do seu endereço: ");
			address = scanner.nextLine();
			
			System.out.print("Agora informe o número: ");
			addressNumber = scanner.nextInt();
			
			System.out.print("Agora informe se você é Pessoa Física ou Jurídica (digite PF/ PJ): ");
			clientType = scanner.nextLine();
			
			condition = ValidateClientType.validateClientType(clientType);
			
			while (!condition) {
				System.out.print("Favor informar o tipo de cliente: digite PF para Pessoa Física e PJ para Pessoa Jurídica: ");
				clientType = scanner.nextLine();
				condition = ValidateClientType.validateClientType(clientType);
			}
			
			fullAdress = new Address(address, addressNumber);
			
			if (clientType.equalsIgnoreCase("PF")) {
				client = new Client(name, fullAdress, ClientType.PESSOA_FISICA);
			}
			else {
				client = new Client(name, fullAdress, ClientType.PESSOA_JURIDICA);
			}
			

		}
		catch(InputMismatchException | IllegalArgumentException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
