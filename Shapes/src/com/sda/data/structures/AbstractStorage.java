package com.sda.data.structures;

import java.util.List;

import com.sda.shapes.Shape;

public interface AbstractStorage {
	
	void addShapeToList(Shape shape);
	
	void deleteShapeFromList(double area);
	
	void printList();
	
	List<Shape> getList();
}
