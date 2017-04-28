package com.sda.student;

public class Student {

	private String name;
	private String lastname;
	private int year;
	
	public Student() {}
	public Student(String name, String lastname, int year) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
