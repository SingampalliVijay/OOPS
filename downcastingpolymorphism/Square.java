package com.kn.downcastingpolymorphism;

public class Square extends Shape{
	
	double side=4.5;
	public double calculateArea() {
		return side *side;
	}
	
	public double calculateSquarePerimeter() {
		return 4*side;
	}

}
