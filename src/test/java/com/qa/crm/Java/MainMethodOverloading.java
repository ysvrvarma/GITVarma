package com.qa.crm.Java;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		//JVM will search main method with (String[] args) first then it will display only that method code.it will not execute
		//other methods. if will wat to execute we need call that methods from main method then only it will work.
		main("Testing");
		main(10);
		main(100,200);
     
	}

	public static void main(String args) {
		System.out.println("Main Method-1");

	}

	public static void main(int a) {
		System.out.println("Main Method-2");

	}
	
	public static void main(int a,int b) {
		System.out.println("Main Method-3");

	}
}
