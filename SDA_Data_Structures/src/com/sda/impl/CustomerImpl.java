package com.sda.impl;

import com.sda.api.Customer;

public class CustomerImpl implements Customer {

	private String name;

	public CustomerImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		
		return name;
	}

}
