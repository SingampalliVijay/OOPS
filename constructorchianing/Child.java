package com.kn.constructorchianing;

public class Child extends Parent {
      
	String name="Vijay";
	int age=22;
	
	public Child(){
		this(57);
		System.out.println("Child with no args");
	}
	public Child(String name) {
		System.out.println("Child with 1-String arg");
		this.name=name;
	}
	public Child(int age) {
		this("Ajay",20);
		System.out.println("Child with 1-int arg ");
	}
	public Child(String name,int age) {
		super(name,age);
		System.out.println("Child with 2-args");
		System.out.println("** Before :");
		System.out.println(" Child Name ="+this.name);
		System.out.println(" Child Age ="+this.age);
		this.name=name;
		this.age=age;
		System.out.println(" Parent Name ="+super.name);
		System.out.println(" Parent Age ="+super.age);
		System.out.println(" Child Name ="+this.name);
		System.out.println(" Child Age ="+this.age);
	}

}
