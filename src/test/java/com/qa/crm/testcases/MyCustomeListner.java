package com.qa.crm.testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyCustomeListner extends ScreenShotBase implements ITestListener{
	 
	 public void onTestStart(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onTestSuccess(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onTestFailure(ITestResult result) 
	 {
		 String MName = result.getMethod().getMethodName();
		 System.out.println("Test Failed " +MName);
		 failedScreenshot(MName);
	 
	 }
	 
	 public void onTestSkipped(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onStart(ITestContext context) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onFinish(ITestContext context) {
	 // TODO Auto-generated method stub
	 
	 }
	 
}
