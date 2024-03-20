package com.kn.upcasting.polymorphism;

public class Geometry {

	 public void doActivity(Shape sh) {
		 sh.draw();
		System.out.println("Area ="+sh.calculateArea());
	 }
}
