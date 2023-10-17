package app;

//TODO refatorar o código para evitar repetições e desenvolver uma lógica para efetuar transações

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Integer condition;

		try {
					
			
			do {
				
				condition = scanner.nextInt();
				
				
				
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
