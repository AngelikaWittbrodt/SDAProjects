package com.sda.api;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

public class JSONParser {

	private final static String url = "http://api.db-ip.com/v2/b620ee363136c97670e9054d4d2fa361c642c789/";

	public static void main(String args[]) {

		List<String> addresses = Arrays.asList("164.12.33.45", "174.12.33.45", "127.0.0.127", "172.217.23.46",
				"192.168.12.34", "185.11.130.82", "104.192.143.3", "145.237.193.133");

		try {
			parseJSON(url,addresses.get(6));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void parseJSON(String urlPath, String adress) throws IOException {

		String s = urlPath.concat(adress);
		URL url = new URL(s);
		
		//read form the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String();
		while(scan.hasNext()) {
			str +=scan.nextLine();
		}
		scan.close();
		JSONObject jsonObject = new JSONObject(str);

		String ipAddress = jsonObject.getString("ipAddress");
		String continentCode = jsonObject.getString("continentCode");
		String continentName = jsonObject.getString("continentName");
		String countryCode = jsonObject.getString("countryCode");
		String countryName = jsonObject.getString("countryName");
		String stateProv = jsonObject.getString("stateProv");
		String city = jsonObject.getString("city");

		List<String> ip = new LinkedList<>();

		ip.add(ipAddress);
		ip.add(continentCode);
		ip.add(continentName);
		ip.add(countryCode);
		ip.add(continentName);
		ip.add(stateProv);
		ip.add(city);

		for (int i = 0; i < ip.size(); i++) {
			System.out.println(ip.get(i));
		}
	}

}
