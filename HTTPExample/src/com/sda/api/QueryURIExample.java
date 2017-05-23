package com.sda.api;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class QueryURIExample {

	private HashMap<String, String> map;
	private String ua = "Angelika/1.0";

	public QueryURIExample() {
	}

	public String makeQuery(HashMap<String, String> map) {
		String text = "";
		String[] arr = null;
		for (String key : map.keySet()) {
			text += key + "=" + map.get(key) + "&";
			arr = text.split("&");

		}
		return arr[1] + "&" + arr[0];
	}

	public HashMap<String, String> mapQueryURI(String queryURI) {

		map = new HashMap<>();
		String[] arry = queryURI.split("&");
		String[] ar1 = null;
		String key = "";
		String value = "";

		for (int i = 0; i < 2; i++) {
			ar1 = arry[i].split("=");
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					key = ar1[j];
				} else {
					value = ar1[j];
				}
			}
			map.put(key, value);
		}
		return map;
	}

	//check login status if is "ok" or "error"
	
	public String checkLoginStatuses(String url, String login) throws IOException {
		URL urlObject = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("User - Agent", ua);
		;

		//String myParams = "klucz=test&haslo=qwerty";
		String myParams = login+"=test&haslo=qwerty";

		// true if you intend to use the URL connection for output
		connection.setDoOutput(true);
		DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
		dataOutputStream.writeBytes(myParams);
		dataOutputStream.flush();
		dataOutputStream.close();
		// end POST

		String ret = "";
		if (connection.getResponseCode() == 200) {
			Scanner sc = new Scanner(new InputStreamReader(connection.getInputStream()));
			while (sc.hasNextLine()) {
				ret += sc.nextLine();
			}
			sc.close();
		}
		return ret;

	}

}
