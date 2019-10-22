package com.qa.crm.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class MyRetry implements IRetryAnalyzer
{
private int retryCount=0;
private int maxCount=3;

public boolean retry(ITestResult result) 
{
	if (retryCount < maxCount) 
	{
	      retryCount++;
	      return true;
	    }

	return false;
}
}
