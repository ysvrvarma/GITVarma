package com.qa.crm.Java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		
		ar.add("Surya");
		ar.add(100.25);
		ar.add("Y");
		
		for (int i=0; i < ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		System.out.println("********************************");
		ArrayList<Integer> ar1= new ArrayList<Integer>();  //it will accept only integer values
		
		ar1.add(1001);
		ar1.add(2001);
		for (int i=0; i < ar1.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("********************************");
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Test");
		ar2.add("World");
		for (int i=0; i < ar1.size();i++)
		{
			System.out.println(ar2.get(i));
		}

	}

}
