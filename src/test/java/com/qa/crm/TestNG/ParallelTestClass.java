package com.qa.crm.TestNG;

import org.testng.annotations.Test;

public class ParallelTestClass {
  
  @Test
  public void Test1() 
  {
	//Printing Id of the thread on using which test method got executed 
	  System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getId());
  }
  
  @Test
  public void Test2() 
  {
	//Printing Id of the thread on using which test method got executed 
	  System.out.println("Test Case Two with Thread Id:- "+ Thread.currentThread().getId());
  }
  
  @Test
  public void Test3() 
  {
	//Printing Id of the thread on using which test method got executed 
	  System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getId());
  }
  
  @Test
  public void Test4() 
  {
	//Printing Id of the thread on using which test method got executed 
	  System.out.println("Test Case Two with Thread Id:- "+ Thread.currentThread().getId());
  }
}
