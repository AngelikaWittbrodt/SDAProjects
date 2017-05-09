package com.sda.generator;

public class User {

	private String name;
	private String lastName;
	private UserSex sex;
	private UserAdress adress;

	public User() {

	}

	public User(String name, String lastName, UserSex sex, UserAdress adress) {
		this.name = name;
		this.lastName = lastName;
		this.sex = sex;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Imie: " + this.name+" Nazwisko: "+this.lastName+" Płeć: "+this.sex+" Adres: "+this.adress;
	}
}
