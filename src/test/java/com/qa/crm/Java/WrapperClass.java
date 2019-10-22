package com.qa.crm.Java;

public class WrapperClass {

	public static void main(String[] args) 
	{
		//1.String to integer
		String str="100";
        int i=Integer.parseInt(str);
        System.out.println(i);
        
        int sum = i+10;
        System.out.println(sum);
        
        //String to double
        String str1="10.50";
        double d=Double.parseDouble(str1);
        System.out.println(d);
        
        double sum1=d+111.15;
        System.out.println(sum1);
        
        
      //3. int to String:
      		int k = 100;
      		System.out.println(k+20);
      		String p = String.valueOf(k); //"100"
      		System.out.println(p+20);
        
        
        

	}

}
