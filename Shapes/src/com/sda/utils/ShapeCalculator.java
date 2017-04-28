package com.sda.utils;

import com.sda.shapes.Circle;
import com.sda.shapes.Shape;

public class ShapeCalculator {
	
	public static void main(String args[]) {
		System.out.println(calculateArea(new Circle(2)));
	}
	
	public static double calculateArea(Shape sh) {		

		sh.area();
		sh.circut();
		
		return sh.area();
	}
}
