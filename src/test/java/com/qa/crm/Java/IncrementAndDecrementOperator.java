package com.qa.crm.Java;



public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=i++; //post-increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a=1;
		int b=++a; //pre-increment
		
		System.out.println(a);
		System.out.println(b);
		
		int x=2;
		int y=x--; //post-Decrement
		
		System.out.println(x); //1
		System.out.println(y); //2
		
		int p=2;
		int q=--p; //pre -decrement
		
		System.out.println(p); //1
		System.out.println(q);//1
		
//Scanner sc = new Scanner(System.in);
//String Str=sc.next();
//System.out.println(Str);
	}

}
