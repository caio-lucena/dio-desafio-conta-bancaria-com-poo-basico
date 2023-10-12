package util;

public class ValidateAccountType {
	
	public static boolean validateClientType(String accountType) {
		
		boolean condition = accountType.equalsIgnoreCase("CC") || accountType.equalsIgnoreCase("CP");
		
		if(condition) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
