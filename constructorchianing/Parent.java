package com.kn.constructorchianing;

public class Parent {

	 String name="Papa";
	 int age=35;
	public Parent() {
	  this("papa",35);
	  System.out.println("Parent no arg Constructor ");
	}
	public Parent(String name, int age) {
		super();
		System.out.println("Parent class 2-arg ");
		System.out.println("** Before :");
		System.out.println(" Parent Name ="+this.name);
		System.out.println(" Parent Age ="+this.age);
		this.name = name;
		this.age = age;
		
	}
	
	
	 
}
