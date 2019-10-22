package com.qa.crm.TestNG;

import org.testng.annotations.Test;

public class GroupsTest1 {
  
 @Test(priority = 1, description = "GroupsTest TestCASE 1",groups = { "Regression", "Smoke"} )
  public void GroupsTest1A()
  {
	  System.out.println("GroupsTestTest1");
  }
 @Test(priority = 2, description = "GroupsTest TestCASE 2",groups = { "Regression", "Smoke"})
 public void GroupsTest1B()
 {
	  System.out.println("GroupsTestTest2");
 }
 @Test(priority = 3, description = "GroupsTest TestCASE 3",groups = { "Regression", "Sanity"})
 public void GroupsTest1C()
 {
	  System.out.println("GroupsTestTest3");
 }
 @Test(priority = 4, description = "GroupsTest TestCASE 4",groups = { "Regression", "Sanity"} ) 
 public void GroupsTest1D()
 {
	  System.out.println("GroupsTestTest4");
 }
 @Test(priority = 5, description = "GroupsTest TestCASE 5",groups = { "Regression", "Smoke"})
 public void GroupsTest1E()
 {
	  System.out.println("GroupsTestTest5");
 }
}
