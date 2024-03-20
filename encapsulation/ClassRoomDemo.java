package com.kn.encapsulation;

public class ClassRoomDemo {

	public static void main(String[] args) {
	
		ClassRoom c1=new ClassRoom();
		
//		System.out.println("Temperature ="+c1.temperature);
//		c1.temperature=26;
//		System.out.println("Temperature ="c1.temperature);
		
		
		System.out.println("Temperatur ="+c1.getTemperature());
		c1.setTemperature(26);
		System.out.println("Modified Temp ="+c1.getTemperature());

	}

}
