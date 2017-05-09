package com.sda.academystore;

import java.util.ArrayList;
import java.util.List;

public class Store {

	// Zawieranie. M�j sklep zawiera list� produkt�w. Deklarujemy list�
	// obiekt�w, czyli jest null. Pole nie jest zainicjalowanie.

	private List<Product> products = new ArrayList<>();

	// Dodanie produkt�w do listy, to jest dodanie produkt�w do sklepu.
	public void add(Product product) {
		products.add(product);
	}

	public void showProducts(Category category) {
		for (Product product : products) {
			System.out.println(product.getName());
		}
	}

	public void showProduct(Category category) {
		for (Product product : products) {
			if (product.getCategory().equals(category)) {
				System.out.println(product.getName());
			}
		}
	}
}
