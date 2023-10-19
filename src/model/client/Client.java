package model.client;

import model.enums.ClientType;

public class Client {
	
	private String name;
	private Address address;
	private ClientType type;
	
	public Client(String name, Address address, ClientType type) {
		this.name = name;
		this.address = address;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ClientType getType() {
		return type;
	}

	public void setType(ClientType type) {
		this.type = type;
	}

}
