package com.sda.impl;

import java.util.ArrayList;
import java.util.List;
import com.sda.api.Item;
import com.sda.api.Structure;

public class GroceryBag implements Structure<Item> {

	private List<Item> listOfItems = new ArrayList<>();
	
	@Override
	public void push(Item item) {
		listOfItems.add(item);
	}

	@Override
	public Item pop() {
		Item itemToPop = listOfItems.get(listOfItems.size()-1);
		listOfItems.remove(listOfItems.size()-1);	
		return itemToPop;
	}

	@Override
	public Item peek() {
		
		return listOfItems.get(0);
	}

	@Override
	public void printStructure() {	
	}

}
