package com.sda.main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HTTPConnectionExample {

	// definiujemy przeglądarkę (user-agent)
	String ua = "Angelika/1.0";

	// Metoda przechowująca GET(jawny)
	// przykład: adres.pl/index.php?klucz=wartość <- to jest Query URI
	// POST(niejawny)
	// zbadaj zródło strony (Ctrl+U) zwraca DOM

	public String sendGET(String url) throws IOException {
		// definujemy adres połączenia (host)
		// String url = "http://wp.pl";

		// Definiuje obiekt typu URL - odwołujemy się pod wskazany adres
		URL obj = new URL(url);
		// Otwieram połączeie
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", ua);
		// Badamy status response kod 200 = 'OK'
		// 400 i 401 oznacza brak dostępu

		String ret = "", currentLine = "";

		if (con.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((currentLine = br.readLine()) != null) {
				// concant
				ret += currentLine;
			}
			br.close();
		}
		return ret;
	}

	public String sentPOST(String url) throws IOException {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("POST");
		con.setRequestProperty("User - Agent", ua);

		String myParams = "klucz=wartosc&innyklucz=innawartosc";
		myParams = "login=test&haslo=qwerty";

		con.setDoOutput(true);

		DataOutputStream dos = new DataOutputStream(con.getOutputStream());
		dos.writeBytes(myParams);
		// dos flush czyści strumień
		dos.flush();
		dos.close();

		// Koniec POST'A

		String ret = "";
		if (con.getResponseCode() == 200) {
			Scanner sc = new Scanner(new InputStreamReader(con.getInputStream()));
			while (sc.hasNextLine())
				ret += sc.nextLine();
			sc.close();
		}
		return ret;
	}
}
