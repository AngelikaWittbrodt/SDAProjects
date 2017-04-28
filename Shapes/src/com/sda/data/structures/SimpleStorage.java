package com.sda.data.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sda.shapes.Shape;

public class SimpleStorage implements AbstractStorage {

	private List<Shape> container;

	public SimpleStorage() {
		this.container = new ArrayList<>();
		//list.clear();
	}

	@Override
	public void addShapeToList(Shape shape) {
		container.add(shape);
	}

	@Override
	public void deleteShapeFromList(double area) {
		ListIterator<Shape> iterator = container.listIterator();
		//zwraca true or false
		while (iterator.hasNext() ) {
			Shape element = iterator.next();
			if (element.area() == area) {
				iterator.remove();
			}
		}
	}

	@Override
	public void printList() {
		for (Shape sh : container) {
			System.out.println(sh.getClass().getSimpleName()+" "+sh.area());
		}
	}
	
	@Override
	public List<Shape> getList() {
		return container;
	}
}
