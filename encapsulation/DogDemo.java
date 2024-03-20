package com.kn.encapsulation;

public class DogDemo {
     public static void main(String[] args) {
		
    	 Dog d1=new Dog("Puppy","White",15,"Pug");
    	 
    	 System.out.println("Name ="+d1.getName());
    	 System.out.println("Color ="+d1.getColor());
    	 System.out.println("Age ="+d1.getAge());
    	 System.out.println("breed ="+d1.getBreed());
    	 
    	 
    	 d1.setName("Charlie");
    	 d1.setColor("Brown");
    	 d1.setAge(20);
    	 d1.setBreed("German Shepherd");
    	 
    	 System.out.println(" ");
    	 System.out.println(" <<< - >>>");
    	 System.out.println("Name ="+d1.getName());
    	 System.out.println("Color ="+d1.getColor());
    	 System.out.println("Age ="+d1.getAge());
    	 System.out.println("breed ="+d1.getBreed());
    	 
    	 
    	 Dog d2=new Dog("Tom","Black",22,"Bulldog");
    	 
    	 d2.setName("Tommy");
    	 d2.setColor("Brown");
    	 d2.setAge(17);
    	 d2.setBreed("French Bulldog");
    	
    	 System.out.println(" ");
    	 System.out.println("   ---- ");
    	 System.out.println("Name ="+d2.getName());
    	 System.out.println("Color ="+d2.getColor());
    	 System.out.println("Age ="+d2.getAge());
    	 System.out.println("breed ="+d2.getBreed());
	}
}
