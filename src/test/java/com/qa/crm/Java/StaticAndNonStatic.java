package com.qa.crm.Java;

public class StaticAndNonStatic {
	
	String name = "Varma";
	static int age=30;

	public static void main(String[] args) 
	
	{
		StaticAndNonStatic obj = new StaticAndNonStatic();
		//Static method calling 3  ways (actually 3 ways 3rd way will give the warning
		sum();  //1 - direct calling - by using method name 
		StaticAndNonStatic.sum(); //by using class name 
		obj.sum(); // by using class referance
		
		//non static method calling 
		obj.sendmail();
		
		//Non static variable 
		System.out.println(obj.name);
		
		//Static variable
		int k = obj.age;
		int i=age;
		int x=StaticAndNonStatic.age;
		System.out.println(k);
		System.out.println(i);
		System.out.println(x);
	}
	
	public void sendmail()
	{
		System.out.println("Sendmail");
	}
	
	public static void sum()
	{
		System.out.println("static method sum");
	}

}
