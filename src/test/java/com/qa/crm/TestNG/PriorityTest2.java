package com.qa.crm.TestNG;

import org.testng.annotations.Test;

public class PriorityTest2 {
  
 @Test(priority = 1, description = "PriorityTest2 Test1")
  public void PriorityTest2A()
  {
	  System.out.println("PriorityTest2 Test1");
  }
 @Test(priority = 2, description = "PriorityTest2 Test2")
 public void PriorityTest2B()
 {
	  System.out.println("PriorityTest2 Test2");
 }
 @Test(priority = 3, description = "PriorityTest2 Test3" )
 public void PriorityTest2C()
 {
	  System.out.println("PriorityTest2 Test3");
 }
 @Test(priority = 4, description = "PriorityTest2 Test4")
 public void PriorityTest2D()
 {
	  System.out.println("PriorityTest2 Test4");
 }
 @Test(priority = 5, description = "PriorityTest2 Test5")
 public void PriorityTest2E()
 {
	  System.out.println("PriorityTest2 Test5");
 }
}
