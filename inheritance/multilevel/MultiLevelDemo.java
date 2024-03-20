package com.kn.inheritance.multilevel;

public class MultiLevelDemo {

	public static void main(String[] args) {
	
	Vehicle v1=new Vehicle();
	v1.registrationNumber=111;
	System.out.println(">>> Registration number ="+v1.registrationNumber);
     v1.move();
     System.out.println();
     
     Car c1=new Car();
     c1.registrationNumber=999;
     System.out.println(">>> Registration number ="+c1.registrationNumber);
     System.out.print("Car is");
     c1.move();
     System.out.println();
     
     Sedan s1=new Sedan();
     s1.registrationNumber=123;
     System.out.println("Registration number ="+s1.registrationNumber);
     System.out.print("Sedan car is");
     s1.move();
	}

}
