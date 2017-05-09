package com.sda.generator;

public class UserAdress {

	private String street;
	private String city;
	private String no;
	private String zipCode;

	public UserAdress() {
	}

	public UserAdress(String street, String no, String city, String zpiCode) {
		this.street = street;
		this.city = city;
		this.no = no;
		this.zipCode = zpiCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getZpiCode() {
		return zipCode;
	}

	public void setZpiCode(String zpiCode) {
		this.zipCode = zpiCode;
	}

	public String toString() {
		return " " + this.street + " " + this.no + ", " + " " + this.zipCode + " " + this.city;

	}
}
