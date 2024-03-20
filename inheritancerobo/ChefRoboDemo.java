package com.kn.inheritancerobo;

public class ChefRoboDemo {

	public static void main(String[] args) {
	
		ChefRobo chef1=new ChefRobo();
		
		chef1.name="Strange";
		chef1.type="Indian";
		System.out.println("Name ="+chef1.name);
        System.out.println("Type ="+chef1.type);
        chef1.walk();
        chef1.talk();
        chef1.charge();
        chef1.cook();
	}
}
