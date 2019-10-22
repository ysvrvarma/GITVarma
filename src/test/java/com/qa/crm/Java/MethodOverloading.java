package com.qa.crm.Java;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(30,100);
		
		

	}
	
	public void sum()
	{
		System.out.println("method without any parameters");
	}

	public void sum(int i)
	{
		System.out.println("method with 1 parameter");
		System.out.println(i);
	}
	
	public void sum(int a,int b)
	{
		System.out.println("method with 2 parameters");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void sum(int x,int y, int z)
	{
		System.out.println("method with 3 parameters");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	

}
