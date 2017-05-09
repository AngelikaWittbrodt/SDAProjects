package com.sda.academystore;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		System.out.println("Wybierz produkt: ");

		store.add(new Product("Masło",2,Category.FOOD));
		store.add(new Product("Kurtka",200,Category.CLOTHES));
		store.add(new Product("Wódka",40,Category.ALCOHOL));
		store.add(new Product("LaptopASUS",1500,Category.ELECTRONICS));
		store.add(new Product("LaptopDELL",1000,Category.ELECTRONICS));
		store.showProduct(Category.FOOD);
		store.showProduct(Category.ELECTRONICS);
		
	}

}
