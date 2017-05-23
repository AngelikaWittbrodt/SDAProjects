package com.sda.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		HTTPConnectionExample c = new HTTPConnectionExample();

		try {
			System.out.println(c.sendGET("http://wp.pl"));
			//System.out.println(c.sentPOST("http://palo.ferajna.org/sda/wojciu/json.php"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
