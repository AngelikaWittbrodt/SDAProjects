package com.sda.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QueryURITest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		QueryURIExample uri = new QueryURIExample();
		List<String> logins = Arrays.asList("tester", "administrator", "admin", "oper", "test", "pawel", "superadmin",
				"operator", "login");
		
		 map.put("klucz", "wartosc");
		 map.put("drugiKlucz", "drugaWartosc");
		
		 for (String key : map.keySet()) {
		 System.out.println("Dla klucza: " + key + " wartość wynosi: " +
		 map.get(key));
		 }
		
		 System.out.println(uri.makeQuery(map));

		String queryURI = "klucz=wartosc&drugiKlucz=drugaWartosc";
		 System.out.println(uri.mapQueryURI(queryURI));

		try {
			for (int i = 0; i < logins.size(); i++) {
				String login = logins.get(i);
				System.out.println(uri.checkLoginStatuses("http://palo.ferajna.org/sda/wojciu/json.php", login));
			}
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
