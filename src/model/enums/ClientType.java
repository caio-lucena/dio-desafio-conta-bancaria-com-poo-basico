package model.enums;

public enum ClientType {
	
	PESSOA_FISICA("Pessoa Física", "PF"),
	PESSOA_JURIDICA("Pessoa Jurídica", "PJ");
	
	private String clientTypeFullName;
	private String clientTypeAbreviation;
	
	private ClientType(String clientTypeFullName, String clientTypeAbreviation) {
		this.clientTypeFullName = clientTypeFullName;
		this.clientTypeAbreviation = clientTypeAbreviation;
	}

	public String getClientTypeFullName() {
		return clientTypeFullName;
	}

	public String getClientTypeAbreviation() {
		return clientTypeAbreviation;
	}

}
