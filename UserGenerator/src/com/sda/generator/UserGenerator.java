package com.sda.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserGenerator {
	private final String path = "src//com/sda//resources//";
	private HashMap<String, ArrayList<String>> resources = new HashMap<>();
	private final List<String> files = Arrays.asList("im_m.txt", "im_f.txt", "miasta.txt", "nazwiska.txt", "ulice.txt");

	public UserGenerator() throws FileNotFoundException {
		this.readFile();
	}

	public User getRandomUser() {
		String fileSex = "im_f";
		UserSex sex = UserSex.SEX_FEMALE;
		if (this.getRandomSex() == UserSex.SEX_MALE) {
			fileSex = "im_m";
			sex = UserSex.SEX_MALE;
		}
		return new User(this.getRandomValueByKey(fileSex), this.getRandomValueByKey("nazwiska"), sex,
				this.getRandomAdres());
	}

	public UserAdress getRandomAdres() {
		Integer no = this.getRandomNumberFromRange(1, 100);
		Integer n1 = this.getRandomNumberFromRange(100, 200);
		return new UserAdress(this.getRandomValueByKey("ulice"), no.toString(), this.getRandomValueByKey("miasta"),
				no.toString().concat(" - ").concat(n1.toString()));
	}

	public String getRandomZipCode() {
		Random r = new Random();
		int nb1 = r.nextInt(99);
		int nb2 = r.nextInt(500);
		return nb1 + " - " + nb2;
	}

	public int getRandomNumberFromRange(int from, int to) {
		Random r = new Random();
		return r.nextInt(to - from + 1)+ from;
	}

	private UserSex getRandomSex() {
		Random r = new Random();
		int rand = r.nextInt(2);
		if (rand == 0)
			return UserSex.SEX_FEMALE;
		else
			return UserSex.SEX_MALE;

	}

	private String getRandomValueByKey(String key) {
		Random r = new Random();
		if (this.resources.containsKey(key)) {
			int myRandInt = r.nextInt(this.resources.get(key).size());
			return this.resources.get(key).get(myRandInt);
		}
		return null;
	}

	private void readFile() throws FileNotFoundException {
		for (String filename : this.files) {
			Scanner s = new Scanner(new File(this.path + filename));
			String[] myFileChoices = filename.split("\\.");
			String key = myFileChoices[0].toLowerCase();
			String myCurrentLine = "";
			ArrayList<String> list = new ArrayList<String>();

			if (!this.resources.containsKey(key)) {
				while (s.hasNextLine()) {
					myCurrentLine = s.nextLine();
					list.add(myCurrentLine);
				}
				s.close();
				this.resources.put(key, list);
			}
		}
	}
}