package com.qa.crm.OOPS1;

public class TestBank {

	public static void main(String[] args) {
		
		ICICBank ic = new ICICBank();
		ic.credit();
		ic.debit();
		ic.moneytansfer();
		ic.mutualfund();
		ic.homeLoan();
		ic.goldLoan();
		
		System.out.println(UKBank.min_bal);
		
		System.out.println("*********"); 
		UKBank uk= new ICICBank();
		uk.debit();
		uk.credit();
		uk.moneytansfer();
	
		USBank us= new ICICBank();
		us.mutualfund();
	}

}
