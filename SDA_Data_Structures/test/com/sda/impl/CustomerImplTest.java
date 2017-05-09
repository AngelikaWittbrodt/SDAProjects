package com.sda.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sda.api.Customer;

public class CustomerImplTest {

	@Test
	public void testGetName() {
		Customer firstCustomer = new CustomerImpl("Bozenka");

		System.out.println("Name of customer is " + firstCustomer.getName());

		assertTrue(firstCustomer.getName().equals("Bozenka"));
		//assertTrue(firstCustomer.getName().equals("Grazynka"));
		//assertFalse(firstCustomer.getName().equals("Bozenka"));
	}

	@Test
	public void testSomethingElse() {
		System.out.println("This is my second test.");
	}
}
