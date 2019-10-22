package com.qa.crm.Java;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//integer array
		int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=3;
		a[3]=5;
		a[4]=50;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//Double array of size 4
		double x[]={10.1,11.22,22,33};
		
		for( double y:x)
		{
			System.out.println(y);
		}
		
		//Char array
		char c[]= {'I','2','#'};
		//System.out.println(c);
		for(int p=0;p<c.length;p++)
		{
			System.out.println(c[p]);
		}
		
		//5. String:
				String s[] = new String[3];
				s[0]="Tom";
				s[1]="test";
				s[2]="selenium";
				
				//System.out.println(Arrays.toString(s));
				for (String str : s) {
					System.out.println(str);
					
				}
				
				boolean b[]=new boolean[2];
				b[0]=false;
				b[1]=true;
				System.out.println("Java boolean Array ");
			    for(int i=0; i < b.length;i++)
			    {
			      System.out.println("boolean array Element at : "+ i + " " + b[i]);
			    }
}
	}
