package com.kn.downcastingpolymorphism;

public class Circle extends Shape {
	double radius=2.5;
	@Override // Annotation
	public double calculateArea() {
	
		 return Math.PI*radius* radius;
	}
	public double calculateCirclePerimeter() {
		return 2*Math.PI*radius;
	}

	
}
