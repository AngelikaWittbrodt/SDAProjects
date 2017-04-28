package com.sda.data.structures;

import com.sda.shapes.Circle;
import com.sda.shapes.Rectangle;
import com.sda.shapes.Square;

public class MainStorage {

	public static void main(String[] args) {

		SimpleStorage ss = new SimpleStorage();

		// System.out.println(list.getClass().getSimpleName());
		ss.addShapeToList(new Circle(1));
		ss.addShapeToList(new Circle(2));
		ss.addShapeToList(new Rectangle(2, 0));
		ss.addShapeToList(new Rectangle(2, 2));
		ss.addShapeToList(new Square(1));
		ss.addShapeToList(new Square(3));

		ss.deleteShapeFromList(20);

		ss.printList();
	}

}
