package com.qa.crm.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.crm.testcases.MyScreenRecorder.MyScreenRecorderTest;

public class HandleWindowPopup {
  
  @Test
  public void WindowHandlerTest() throws Exception 
  {
	//1. alerts -- JavaScript Pop UP-- Alert API (accept, dismiss)
	//2. File Upload pop up -- Browse Button (type = file, sendKeys(path)
	//3. Browser Window Popup - Advertisement pop up (windowHandler API - getWindowHandles() )
	  	
	     MyScreenRecorderTest.startRecording("WindowHandlerTest"); //testcase video recording 
	     WebDriver driver = new FirefoxDriver(); //launch firefox
	  
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
	  
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> itr = handler.iterator();
		
		String parentWindowID = itr.next();
		System.out.println("Parent Window id " +parentWindowID);
		System.out.println("Parent Window Title " +driver.switchTo().window(parentWindowID).getTitle());
		Thread.sleep(5000);
		
		
		String childWindowID = itr.next();
		System.out.println("Child Window id " +childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title " +driver.switchTo().window(childWindowID).getTitle());
		
		MyScreenRecorderTest.stopRecording(); 
		
  }
}
