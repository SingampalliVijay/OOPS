package com.kn.downcastingpolymorphism;

public class Rectangle extends Shape{
 
	double length=5.5 , breadth=2.5;
	@Override
	public double calculateArea() {
		
		return length*breadth;
	}
	
	public double calculateRectanglePerimeter() {
		return 2*(length+breadth);
	}
	

}
