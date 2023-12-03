package util.implementation;

public class Menu {
	
	public static void showMenu() {
		var menu = """
				
				****** Bem vindo ao DIO Bank! ******
				
				Por favor, selecione uma das opções:
				
				1 - Criar conta
				2 - Depositar
				3 - Sacar
				4 - Transfência entre constas
				5 - Listar clientes do banco
				0 - Sair do sistema
				""";
		
		System.out.println(menu);
	}

}
