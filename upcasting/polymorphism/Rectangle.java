package com.kn.upcasting.polymorphism;


public class Rectangle extends Shape {

	@Override
	public void draw() {
	System.out.println("Drawing Rectangle");
	}

	@Override
	public double calculateArea() {
	double l=20.5, b=5.5;
	return l*b;
	}

	 
}
