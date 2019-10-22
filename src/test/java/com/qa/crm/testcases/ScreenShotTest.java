package com.qa.crm.testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;

//@Listeners(MyCustomeListner.class) --this Annotation is used to implement in class level 
public class ScreenShotTest extends ScreenShotBase{
  @Test
  public void SearchPageTestCase() 
  {
	  Assert.assertEquals(true, false);
  }
  @Test
  public void AddCustomerTestCase() 
  {
	  Assert.assertEquals(true, false);
  }
  @Test
  public void SearchCustomerTestCase() 
  {
	  Assert.assertEquals(true, false);
  }
  
  
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  initialization();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

}
