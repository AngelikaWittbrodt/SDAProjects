package com.sda.tests;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.sda.data.structures.SimpleStorage;
import com.sda.shapes.Circle;
import com.sda.shapes.Shape;

public class SimpleStorageTest {

	SimpleStorage container;

	@Before
	public void setup() {
		container = new SimpleStorage();
	}

	@Test
	public void testAddingToStorage() {		
		container.addShapeToList(new Circle(1));
		container.addShapeToList(new Circle(2));
		container.addShapeToList(new Circle(3));
		container.addShapeToList(new Circle(4));

		container.getList().size();
	}

	@Test
	public void testPrintEntries() {
	}

	@Test
	public void iteratorTest() {
		// list.getClasssss.equals(Circle.class);
		List<Shape> list = new ArrayList<>();

		list.add(new Circle(1));
		list.add(new Circle(1));
		list.add(new Circle(1));

		Iterator<Shape> iter = list.iterator();

		while (iter.hasNext()) {
			Shape element = iter.next();
			if (element.area() == 12) {
				iter.remove();
			}
		}
	}
}
