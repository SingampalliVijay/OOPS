package com.kn.upcasting.polymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
	
		// upcasting method
//	Shape sh=new Shape();
//	Rectangle r=new Rectangle();
//	sh=r;
//	sh.draw();
//	System.out.println("Area ="+sh.calculateArea());
//    System.out.println();
//    
//	Square s=new Square();
//	sh=s;
//	sh.draw();
//	System.out.println("Area ="+sh.calculateArea());
//	System.out.println();
//	
//	Circle c=new Circle();
//	sh=c;
//	sh.draw();
//	System.out.println("Area ="+sh.calculateArea());
	
	// Pass By Reference 
	Rectangle r=new Rectangle();
	Square s=new Square();
	Circle c=new Circle();
	
	Geometry g=new Geometry();
	g.doActivity(r);
	System.out.println();
	g.doActivity(s);
	System.out.println();
	g.doActivity(c);
			

	}

}
