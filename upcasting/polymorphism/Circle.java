package com.kn.upcasting.polymorphism;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double calculateArea() {
		double r=2.5;
		return Math.PI*r*r;
	}

}
