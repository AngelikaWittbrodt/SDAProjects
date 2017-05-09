
package com.sda.academy.calendar;

public class Main {

	public static void main(String[] args) {

		MyDate mydate = new MyDate(1991, 12, 9);
		MyDate mydate1 = new MyDate();

		mydate1.setYear(1900);

		System.out.println(mydate1.isLeapYear(1900));
		System.out.println(mydate1.isValidDate(1900, 12, 3));
		System.out.println(mydate.toString());
	}

}
