package com.sda.company;

public class Company {

	private int starts;
	private int employees;
	private int vat;
	private String test;
	
	public Company() {}
	public Company(int starts, int employees, int vat, String test) {
		super();
		this.starts = starts;
		this.employees = employees;
		this.vat = vat;
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int getStarts() {
		return starts;
	}
	public void setStarts(int starts) {
		this.starts = starts;
	}
	public int getEmployees() {
		return employees;
	}
	public void setEmployees(int employees) {
		this.employees = employees;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	
}
