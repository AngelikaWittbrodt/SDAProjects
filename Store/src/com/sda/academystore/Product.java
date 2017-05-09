package com.sda.academystore;

public class Product {

	//Entity, DTO, OV
	
	private String name;
	private int price;
	private Category category;
	
	public Product(String name, int cena, Category category) {
		this.name = name;
		this.price = cena;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCena() {
		return price;
	}
	public void setCena(int cena) {
		this.price = cena;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}
