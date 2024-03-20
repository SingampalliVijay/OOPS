package com.kn.softwareengg.polymorphism;

public class SoftwareEngineerDemo {

	public static void main(String[] args) {

		/*
		 * SoftwareEngineer se=new SoftwareEngineer(); se.attendmeeting();
		 * se.doTesting(); System.out.println();
		 * 
		 * BackendEngineer be=new BackendEngineer(); be.doTesting(); be.attendmeeting();
		 * be.doBackendProject(); System.out.println();
		 * 
		 * DatabaseEngineer de=new DatabaseEngineer(); de.doTesting();
		 * de.attendmeeting(); de.learnSql(); System.out.println();
		 * 
		 * JavaBackendEngineer je=new JavaBackendEngineer(); je.attendmeeting();
		 * je.doTesting(); je.doBackendProject(); je.learnJava(); System.out.println();
		 * 
		 * PythonBackendEngineer pe=new PythonBackendEngineer(); pe.attendmeeting();
		 * pe.doTesting(); pe.doBackendProject(); pe.learnPython();
		 */

		/*
		 * SoftwareEngineer se; se=new BackendEngineer(); se.doTesting();
		 * se.attendmeeting(); ((BackendEngineer)(se)).doBackendProject();
		 * System.out.println();
		 * 
		 * se=new DatabaseEngineer(); se.doTesting();
		 * ((DatabaseEngineer)(se)).learnSql(); //Down Casting se.attendmeeting();
		 * System.out.println();
		 * 
		 * se=new JavaBackendEngineer(); se.attendmeeting(); se.doTesting();
		 * ((JavaBackendEngineer)(se)).learnJava();
		 * ((JavaBackendEngineer)(se)).doBackendProject(); System.out.println();
		 * 
		 * se=new PythonBackendEngineer(); se.attendmeeting(); se.doTesting();
		 * ((PythonBackendEngineer)(se)).learnPython();
		 * ((PythonBackendEngineer)(se)).doBackendProject();
		 * 
		 */

		/*
		 * SoftwareEngineer se =new SoftwareEngineer();
		 * 
		 * doActivity(se); System.out.println();
		 * 
		 * se=new BackendEngineer(); doActivity(se); System.out.println();
		 * 
		 * se=new BackendEngineer(); doActivity(se); System.out.println();
		 * 
		 * se=new DatabaseEngineer(); doActivity(se); System.out.println();
		 * 
		 * se=new JavaBackendEngineer(); doActivity(se); System.out.println();
		 * 
		 * se=new PythonBackendEngineer(); doActivity(se); System.out.println();
		 */

		SoftwareEngineer se = new SoftwareEngineer();
		BackendEngineer be = new BackendEngineer();
		JavaBackendEngineer je = new JavaBackendEngineer();
		DatabaseEngineer de = new DatabaseEngineer();
		PythonBackendEngineer pe = new PythonBackendEngineer();

		doActivity(se);
		System.out.println();
		doActivity(be);
		System.out.println();
		doActivity(je);
		System.out.println();
		doActivity(de);
		System.out.println();
		doActivity(pe);

	}

	public static void doActivity(SoftwareEngineer se) {
		se.attendmeeting();
		se.doTesting();
		if (se instanceof PythonBackendEngineer) {
			((PythonBackendEngineer) (se)).learnPython();
			((PythonBackendEngineer) se).doBackendProject();
		} else if (se instanceof DatabaseEngineer) {
			((DatabaseEngineer) (se)).learnSql();
			((DatabaseEngineer) se).doBackendProject();

		} else if (se instanceof JavaBackendEngineer) {
			((JavaBackendEngineer) (se)).learnJava();
			((JavaBackendEngineer) (se)).doBackendProject();
		} else if (se instanceof BackendEngineer) {
			((BackendEngineer) (se)).doBackendProject();
		}

	}
}
