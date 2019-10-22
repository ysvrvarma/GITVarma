package com.qa.crm.Java;

public class Employee 
{
	String name;
	int age;
	String dept;
	Employee(String name,int age,String dept )
	{
		this.name=name;
		this.age=age;
		this.dept=dept;  //to access global variables we need to use this keyword
	}
	

}
