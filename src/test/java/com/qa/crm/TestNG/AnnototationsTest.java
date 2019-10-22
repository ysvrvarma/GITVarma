package com.qa.crm.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnototationsTest {
  
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
  public void Test() 
	{
		System.out.println("Test");
    }
	@AfterMethod
	public void AfterMethod() 
	{
		System.out.println("AfterMethod");
    }
	
	@AfterClass
	public void AfterClass() 
	{
		System.out.println("AfterClass");
    }
	
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("AfterTest");
    }
}
