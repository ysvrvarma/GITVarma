package com.qa.crm.OOPS1;

public  interface UKBank 
{
    int min_bal=100;
	public void debit();
    public void credit();
    public void moneytansfer();
    
}
    //1. can not have method body -- only prototype/declaration
	//2. interface vars are static in nature by default. Variable Value will not be changed
	//3. no static methods are allowed
	//4. can not create the object of interface