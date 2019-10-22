package com.qa.crm.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryClassLevelTest {
  
  @Test (retryAnalyzer = MyRetry.class)
  public void TestingRetryClassLvel() 
  {
	System.out.println("TestingRetryClassLvel");
	  Assert.assertEquals(false, true);  
  }
}
