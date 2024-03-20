package com.kn.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
	
		Student s1=new Student(74,"Vijay",77,"Male");
		
       System.out.println("RollNumber ="+s1.getRollNumber());
       System.out.println("Name ="+s1.getName());
       System.out.println("Marks ="+s1.getMarks());
       System.out.println("Gender ="+s1.getGender());
       
       
       s1.setRollNumber(73);
       s1.setName("Kalyan");
       s1.setMarks(67);
       s1.setGender("Male");
       
       System.out.println(" <<< - >>>");
       System.out.println("RollNumber ="+s1.getRollNumber());
       System.out.println("Name ="+s1.getName());
       System.out.println("Marks ="+s1.getMarks());
       System.out.println("Gender ="+s1.getGender());
       
       
	}

}
