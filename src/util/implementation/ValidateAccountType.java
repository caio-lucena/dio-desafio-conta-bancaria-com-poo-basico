package util.implementation;

public class ValidateAccountType {
	
	public static boolean validateAccountType(String accountType) {
		
		boolean condition = accountType.equalsIgnoreCase("CC") || accountType.equalsIgnoreCase("CP");
		
		if(condition) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
