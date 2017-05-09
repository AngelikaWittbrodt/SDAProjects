package com.sda.impl;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	// private List<Object> list = new ArrayList<>();

	/*
	 * @BeforeClass public static void setupBeforeClass() {}
	 */

	/*
	 * @AfterClass public static void teardwonAfterClass() {}
	 */

	@Test
	public void setup() {

		GroceryBag bag = new GroceryBag();

		bag.push(new ItemImpl("mleko", 1));
		bag.push(new ItemImpl("maslo", 2));
		bag.push(new ItemImpl("cukier", 2));

		System.out.println();

	}

}
