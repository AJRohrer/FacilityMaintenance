package com.jsa.facmaint;

public class Address {
	private String _streetName;
	private String _streetNumber;
	private String _city;
	private String _zipCode;
	
	public Address(String StreetName, String StreetNumber, String City, String ZipCode) {
		_streetName = StreetName;
		_streetNumber = StreetNumber;
		_city = City;
		_zipCode = ZipCode;		
	}
	
	
	public Address getAddress() {
		return this;
	}
}
