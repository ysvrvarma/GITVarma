package com.qa.crm.TestNG;

import org.testng.annotations.Test;

public class PriorityTest {
  
 @Test
  public void PriorityTest1()
  {
	  System.out.println("Test1");
  }
 @Test(priority = 2, description = "Test2")
 public void PriorityTest2()
 {
	  System.out.println("Test2");
 }
 @Test(priority = 3, description = "Test3")
 public void PriorityTest3()
 {
	  System.out.println("Test3");
 }
 @Test(priority = 4, description = "Test4")
 public void PriorityTest4()
 {
	  System.out.println("Test4");
 }
 @Test(priority = 5, description = "Test5")
 public void PriorityTest5()
 {
	  System.out.println("Test5");
 }
}
