package com.qa.crm.Java;

public class CallbyValueAndCallByReferance {
	int a;
	int b;
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CallbyValueAndCallByReferance obj = new CallbyValueAndCallByReferance();
	
	    
		int x=20;
	    int y=30;
	    int i1=obj.sum(x, y); //Call by Value or pass by Value .if we are changing the values inside the method it 
	                          //will not effect the values of x and y;
		System.out.println(i1);
		System.out.println(x);
		System.out.println(y);
	    
		obj.a=500;
		obj.b=700;
		
	   int i2= obj.sum(obj); //Call by referance.if we are changing the values(referance) inside the method the 
	                           //reference value will change automatically.
	   System.out.println(i2);
	   System.out.println(obj.a);
	   System.out.println(obj.b);
	   
	    
	    
		
		
		
	}
	
	public int sum(int a, int b)
	{
		a=100;
		b=200;
		int sum=a+b;
		return sum;
	}
	
	public int sum(CallbyValueAndCallByReferance t)
	{
		t.a=1000;
		t.b=2000;
	
		int sum = t.a+t.b;
		return sum;
	}
    
}
