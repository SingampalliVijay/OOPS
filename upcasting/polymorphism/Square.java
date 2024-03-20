package com.kn.upcasting.polymorphism;

public class Square extends Shape {

	@Override
	public void draw() {
	 
		System.out.println("Drawing Square");
	}

	@Override
	public double calculateArea() {
		double side=2.5;
		return side*side;
	}

	 
}
