package com.qa.crm.Java;

public class FinallyConcept {

	public static void main(String[] args) 
	{
		//test1();
		//test2();
		
		division();

	}
	public static void test1()
	{
		try
		{
			System.out.println("Test1-inside try block");
			throw new RuntimeException("test1");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally //finally block is available in try-catch-finally. this block is executed irrespective of try -catch block. it is 
		          //executed after executing of try-catch
		{
			System.out.println("inside finally block");
		}
	}
	
	public static void test2(){
		try{
			System.out.println("inside test2");
		}
		finally{
			System.out.println("finally code in test2 method");
		}
	}
	
	//
	public static void division(){
		int i = 10;
		try{
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(ArithmeticException e){
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		
		finally{
			System.out.println("execute this code even after any exception");
		}
	}
	
	
	

}
