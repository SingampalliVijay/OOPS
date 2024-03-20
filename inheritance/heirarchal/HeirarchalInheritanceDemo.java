package com.kn.inheritance.heirarchal;

public class HeirarchalInheritanceDemo {

	public static void main(String[] args) {
	
		Employee e1=new Employee();
		e1.name="aaa";
		e1.salary=999;
		System.out.println("Employee Name ="+e1.name+" \nSalary ="+e1.salary);
		System.out.println();

		Developer d1=new Developer();
		d1.name="bbb";
		d1.salary=989;
		System.out.println("Employee Name ="+d1.name+" \nSalary ="+d1.salary);
		d1.develop();
		System.out.println();
		
		TestEngineer te1=new TestEngineer();
		te1.name="BBB";
		te1.salary=789;
		System.out.println("Employee Name ="+te1.name+"  \nSalary ="+te1.salary);
		te1.test();
		System.out.println();
		
	    Manager m1=new Manager();
	    m1.name="ABC";
	    m1.salary=567;
	    System.out.println("Employee Name ="+m1.name+" \nSalary ="+m1.salary);
		m1.manage();
		System.out.println();
		
		TeamLead tl1=new TeamLead();
		tl1.name="xyz";
		tl1.salary=789;
		System.out.println("Employee Name ="+tl1.name+" \nSalary ="+tl1.salary);
		tl1.lead();
		
		
		
		
	}

}
