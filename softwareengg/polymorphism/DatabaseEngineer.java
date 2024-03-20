package com.kn.softwareengg.polymorphism;

public class DatabaseEngineer extends SoftwareEngineer{

	@Override
	public void attendmeeting() {
		System.out.println("Database Engineer attending Database meeting");
	}
	public void doBackendProject() {
		System.out.println("Database Engineer doing Database project");
	}
	public void learnSql() {
		System.out.println("Database Engineer Learing SQL");
	}
 
	
}
