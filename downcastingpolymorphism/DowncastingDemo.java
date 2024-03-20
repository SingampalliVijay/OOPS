package com.kn.downcastingpolymorphism;

public class DowncastingDemo {

	public static void main(String[] args) {
/*		
		// Down Casting
//	 Create Parent object reference
		Shape sh;
		
//	Create Child object Up-Casting to parent reference
		sh=new Circle();

//	Inherited method from parent
		sh.draw();
		
//	OverRiden method in Child Class
		System.out.println("Area of Circle ="+sh.calculateArea());
	
//	Calling Child Specific method using Down-casting to Child reference
	System.out.println("Perimeter ="+((Circle)(sh)).calculateCirclePerimeter());
	
	System.out.println(" <<< *** >>>");
//	Create Child object Up-Casting to parent reference
		sh=new Rectangle();

//	Inherited method from parent
		sh.draw();
		
//	OverRiden method in Child Class
		System.out.println("Area of Rectangle ="+sh.calculateArea());
	
//	Calling Child Specific method using Down-casting to Child reference
	System.out.println("Perimeter of Rectangle ="+((Rectangle)(sh)).calculateRectanglePerimeter());
	
	System.out.println(" <<< --- >>>");
//	Create Child object Up-Casting to parent reference
		sh=new Square();

//	Inherited method from parent
		sh.draw();
		
//	OverRiden method in Child Class
		System.out.println("Area of Circle ="+sh.calculateArea());
	
//	Calling Child Specific method using Down-casting to Child reference
	System.out.println("Perimeter ="+((Square)(sh)).calculateSquarePerimeter());
	*/
		
//  Instanceof method
		
		Geometry g=new Geometry();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		
		g.doActivity(c);
		g.doActivity(r);
		g.doActivity(s);
	}
	

}
