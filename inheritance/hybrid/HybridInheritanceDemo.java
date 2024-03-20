package com.kn.inheritance.hybrid;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
	
	EnggStudent es1=new EnggStudent();
	es1.name="Vijay";
	System.out.println("Name ="+es1.name);
	es1.study();
	es1.read();
	System.out.println();
	
	MedicalStudent ms1=new MedicalStudent();
	ms1.name="Ajay";
	System.out.println("Name ="+ms1.name);
	ms1.study();
	ms1.write();
	System.out.println();
	
	JavaTrainer jt1=new JavaTrainer();
	jt1.name="Arun";
	System.out.println("Name ="+jt1.name);
	jt1.train();
	jt1.teach();
	System.out.println();

	SqlTrainer st1=new SqlTrainer();
	st1.name="Yesaswi";
	System.out.println("Name ="+st1.name);
	st1.train();
	st1.tutor();
	System.out.println();

	}

}
