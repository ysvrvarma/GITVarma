package com.qa.crm.OOPS1;

public class ICICBank implements UKBank, USBank  //multiple inheritance
//if a class is Implementing an interface , THEN its mandatory to implement all the methods of interface
{
	public void debit() 
	{
		System.out.println("ICICI--debit");
	}

	public void credit() {
		System.out.println("ICICI--Credit");
	}

	public void moneytansfer() 
	{
		System.out.println("ICICI--moneytansfer");
	}
	
	public void mutualfund() {
		System.out.println("ICICI--mutualfund");
		
	}
	
	public void homeLoan()
	{
		System.out.println("ICICI--HomeLoan");
	}
	
	public void goldLoan()
	{
		System.out.println("ICICI--goldLoan");
	}

	

}
