package com.sda.academystore;

public class CategoryTest {

	public static void main(String[] args) {

		Category category = Category.FOOD;

		System.out.println(category.name());
		System.out.println(category.ordinal());
		System.out.println(category.compareTo(Category.CLOTHES));
		System.out.println(category.compareTo(Category.FOOD));
		System.out.println(category.compareTo(Category.ELECTRONICS));
		Category valueOf = Category.valueOf("FOOD");

		System.out.println(valueOf);
		if (isACategory("cos")) {
			System.out.println("ERROR");
		}
		if (isACategory("FOOD")) {
			System.out.println("OK");
		}
	}

	public static boolean isACategory(String name) {
		try {
			Category.valueOf(name);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}

	}
}
