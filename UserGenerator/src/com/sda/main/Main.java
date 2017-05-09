package com.sda.main;

import java.io.FileNotFoundException;

import com.sda.generator.UserGenerator;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	
//		UserSex sex = UserSex.SEX_FEMALE;
//		UserSex categoryOfSex = UserSex.valueOf("SEX_FEMALE");
//		
//		System.out.println(categoryOfSex);
//		
//		System.out.println(sex.compareTo(sex.SEX_MALE));
//		System.out.println(sex.compareTo(sex.SEX_MALE));
//		System.out.println(sex.values());

		UserGenerator ug = new UserGenerator();
		for (int i = 0; i <= 10; i++)
			System.out.println(ug.getRandomUser());
		
		// Imie: .. Nazwisko: .. Ulica: .. Nr mieszkania: .. PESEL: .. CCN:
	}
}
