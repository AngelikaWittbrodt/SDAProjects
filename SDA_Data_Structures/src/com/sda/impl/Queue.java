package com.sda.impl;

import java.util.ArrayList;
import java.util.List;
import com.sda.api.Customer;
import com.sda.api.Structure;

public class Queue implements Structure<Customer> {

	private List<Customer> listOfCustomers = new ArrayList<>();

	@Override
	public void push(Customer item) {
		listOfCustomers.add(item);
	}

	@Override
	public Customer pop() {
		if (listOfCustomers.isEmpty()) {
			return null;
		}
		Customer customerToPop = listOfCustomers.get(0);
		listOfCustomers.remove(0);
		return customerToPop;
	}

	@Override
	public Customer peek() {
		if (listOfCustomers.isEmpty()) {
			return null;
		}

		return listOfCustomers.get(0);
	}

	@Override
	public void printStructure() {

		for (int i = 0; i < listOfCustomers.size(); i++) {
			if (i == 0) {
				System.out.println("NEXT IS : ");
			}
			System.out.println(listOfCustomers.get(i).getName());
		}
	}

}
