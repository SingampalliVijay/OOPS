package com.kn.studentconstructor;

public class EnggStudent extends Student {

	 
	String branch;
    int sem;
//	super class with no args constuctor will look into parent class where there is not there in parent class
	public EnggStudent() {
		this("Arun",35,"Mech");
		System.out.println("EnggStudent No arg Constuctor");
		
	}
	
	public EnggStudent(String name, int age, String branch, int sem) {
		super(name,age);
		System.out.println("Engg Student 4- arg");
		System.out.println("** Before :");
		System.out.println("Name ="+super.name);
		System.out.println("Age  ="+super.age);
		System.out.println("Branch ="+this.branch);
		System.out.println("Sem  ="+this.sem);
	   this.name=name;
	   this.age=age;
	   this.branch = branch;
	   this.sem = sem;
	System.out.println(" * After:");
	System.out.println("Name ="+this.name);
	System.out.println("Age  ="+this.age);
	System.out.println("Branch ="+this.branch);
	System.out.println("Sem  ="+this.sem);
}

	public EnggStudent(String name, int age,int sem) {
		this.sem=sem;	
	} 
	public EnggStudent(String name,int age,String branch) {
		this("Vijay",22,"Mech",3);
		System.out.println("Engg Student 3-arg");
		this.branch=branch;
	}
}
