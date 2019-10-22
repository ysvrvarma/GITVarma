package com.qa.crm.Java;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("finalize method");
	}
	//finalize is a method

	public static void main(String[] args) 
	{
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		//f2= null;
		
		System.gc();  //finalize is a method. it will be executed before garbage collection command. if we are not using any objects
		             // while running the program JVM will freeze the memory. finalize method will be exected before dc().if we are
		            //not using 10 objects then finalize method will be exeted 10 times.
		
		

	}

}
