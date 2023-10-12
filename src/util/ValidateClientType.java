package util;

public class ValidateClientType {
	
	public static boolean validateClientType(String clientType) {
		
		boolean condition = clientType.equalsIgnoreCase("PJ") || clientType.equalsIgnoreCase("PF");
		
		if(condition) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
