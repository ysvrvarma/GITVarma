package com.qa.crm.Java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		//ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1 = new Employee("Varma",40,"QA");
		Employee e2 = new Employee("Swarna",35,"IT");
		Employee e3 = new Employee("Ruthika",20,"HR");
		ArrayList<Employee> ar =new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		ar.size();
		
	
		Iterator<Employee> it = ar.iterator();
		 
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
			
		}
		
		
		
		

	}

}
