package com.sda.academy.calendar;

import java.util.Map;
import java.util.TreeMap;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String[] strDays = {  "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday" };
	private String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private Map<Integer, String> mapDays;
	private Map<Integer, String> mapMonths;

	public MyDate() {
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		this.mapDays = new TreeMap<>();	
		for (day = 1; day <= strDays.length; day++) {
			mapDays.put(day, strDays[day-1]);
		} 
		
		this.mapMonths = new TreeMap<>();
		for (Integer i=1; i<=strMonths.length;i++) {
			mapMonths.put(i, strMonths[i-1]);
		}
	}

	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String[] getStrMonths() {
		return strMonths;
	}

	public void setStrMonths(String[] strMonths) {
		this.strMonths = strMonths;
	}

	public int[] getDaysInMonths() {
		return daysInMonths;
	}

	public void setDaysInMonths(int[] daysInMonths) {
		this.daysInMonths = daysInMonths;
	}

	public boolean isLeapYear(int year) {
		boolean isLeap = (year % 4 == 0 & year % 100 != 0 || year % 400 == 0);
		System.out.println("Is "+year+" leap year?");
		return isLeap;
	}

	public boolean isValidDate(int year, int month, int day) {
		
		System.out.println("Is "+day+"-"+month+"-"+year+" a valid date?");
		
		// rok przestêpny, sprawdzamy czy rok > 0, miesi¹c <0,12>, dzieñ na
		// podstawoe miesi¹ca ile powinien miec dni miesiac ale rok moze byc
		// przestepny
		return (year>0 && (month >0 && month<=12) && day>0);
	}
	public int getDayOfWeek(int year, int month, int day) {
		return day;
	}
	@Override
	public String toString() {
		return this.day +" "+mapDays.get(day)+ "" + " " + this.month + " " + "" + this.year;
	}
	public MyDate nextDay(int day) {
		return null;
	}
	public MyDate nextMonth(int month) {
		return null;
	}
	public MyDate nextYear(int year) {
		return null;
	}
	public MyDate previousDay(int day) {
		return null;
	}
	public MyDate previousMonth(int month) {
		return null;
	}
	public MyDate previousYear(int year) {
		return null;
	}
}
