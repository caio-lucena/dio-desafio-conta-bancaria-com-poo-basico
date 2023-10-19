package model.client;

public class Address {
	
	private String street;
	private Integer number;
	
	public Address(String street, Integer number) {
		this.street = street;
		this.number = number;
	}
		
	public String getAddress() {
		return this.street + ", number " + this.number;
	}
	
}
