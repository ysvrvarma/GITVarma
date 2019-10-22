package com.qa.crm.Java;

public class FinalDemo {

	public static void main(String[] args) 
	{
	   final int i =100;  //if we are defined one variable with final keyword means we cann't change the value. the variable value
	                       //is constant 
	   System.out.println(i);

	}
        //1.if we want to prevent inheritance we can create class with final keyword . if we define one call with final keyword  
	    //we can not inherit the class means we can not extends the parent(parent is defined as final).
	   //if we define one method as final keyword we cannot override the method in child class.
	   
}
