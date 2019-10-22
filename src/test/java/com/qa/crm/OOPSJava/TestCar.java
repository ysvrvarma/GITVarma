package com.qa.crm.OOPSJava;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();  //compile time polymorphism
		b.stop();
		b.refuel();
	    b.theftsafty();
	    
	    System.out.println("*******"); 
	    Car c = new Car();
	    c.start();
	    c.stop();
	    c.refuel();
	    
	    System.out.println("*******");
	    Car c1=new BMW();//child class object can be referred by parent class reference variable
		//dynamic/Run Time polymorphism
		//Top casting
	    c1.start(); //it will display BMW-Start this is called RunTime Polimorphism
	    c1.stop();
	    c1.refuel();
	    //c1.theftsafty(); // We can not access this method . only we can access common methods (means which is available in child
	                        // and parent as well as parent class methods we can access .

	}

}
