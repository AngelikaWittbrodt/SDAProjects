package com.sda.impl;

import com.sda.api.Item;

public class ItemImpl implements Item {

	private String name;
	private int quantity;
	
	public ItemImpl(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getQuantity() {
		
		return quantity;
	}

}
