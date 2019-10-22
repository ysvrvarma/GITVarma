package com.qa.crm.OOPS1;

public class ICICBank implements UKBank
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
	
	public void homeLoan()
	{
		System.out.println("ICICI--HomeLoan");
	}
	
	public void goldLoan()
	{
		System.out.println("ICICI--goldLoan");
	}

}
