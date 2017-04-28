package com.sda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sda.shapes.Circle;
import com.sda.shapes.Rectangle;
import com.sda.shapes.Square;

public class AreaCalculatorTest {

	private int squareSideLength = 50;
	private int circleRadius = 1;
	
	

	@Test
	public void testCircleArea() {

		Circle cr = new Circle(1);
		double circleArea = cr.area();
		double circleCircut = cr.circut();
		assertTrue(circleArea > 3 && circleArea < 4);
		assertTrue(circleCircut > 6 && circleCircut < 7);
	}

	@Test
	public void testRectangleArea() {

		Rectangle rc = new Rectangle(squareSideLength, circleRadius);
		assertTrue(rc.area() == 50.0);
		assertTrue(rc.circut() == 102.0);
	}

	@Test
	public void testSquareArea() {

		Square sq = new Square(squareSideLength);
		assertTrue(sq.area() == 2500);
		assertTrue(sq.circut() == 200);
	}

}
