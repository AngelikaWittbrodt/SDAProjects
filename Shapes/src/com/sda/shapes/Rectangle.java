package com.sda.shapes;

public class Rectangle implements Shape {

	private int sideA;
	private int sideB;
	
	public Rectangle(int sideA, int sideB) {
		this.sideA= sideA;
		this.sideB = sideB;
	}
	
	@Override
	public double area() {
		return this.sideA*this.sideB ;
	}

	@Override
	public double circut() {
		return 2*this.sideA+2*this.sideB;
	}
}
