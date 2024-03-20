package com.kn.downcastingpolymorphism;

public class Geometry {
 
	public void doActivity(Shape sh) {
		sh.draw();
	System.out.println("Area = "+sh.calculateArea());
	
	if(sh instanceof Circle) {
		System.out.println("Perimeter = "+((Circle)(sh)).calculateCirclePerimeter());
	}else if(sh instanceof Rectangle) {
		System.out.println("Perimeter of Rectangle = "+((Rectangle)(sh)).calculateRectanglePerimeter());
	}else {
		System.out.println("Perimeter = "+((Square)(sh)).calculateSquarePerimeter());
	}
	System.out.println(" ---------------- ");
	}
}
