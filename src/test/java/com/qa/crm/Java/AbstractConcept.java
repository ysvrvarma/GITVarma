package com.qa.crm.Java;

public abstract class AbstractConcept 
//if we are defined class as abstract then the class should have at least one abstract method(method without any body).the class 
//can also contain normal methods also.in interface it is not possible.
{
	public abstract void loan();
	
	public static void deposit()
	{
		System.out.println("Non Abstract method-deposit -parentclass");
	}

}
