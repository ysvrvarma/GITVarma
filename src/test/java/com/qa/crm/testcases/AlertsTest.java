package com.qa.crm.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsTest {
 
  @Test
  public void RediffAlerts() 
  {
	//1. alerts -- JavaScript Pop UP-- Alert API (accept, dismiss)
	//2. File Upload pop up -- Browse Button (type = file, sendKeys(path)
	//3. Browser Window Popup - Advertisement pop up (windowHandler API - getWindowHandles() )
	  
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.xpath("//input[@value='Go']")).click();
	  
	  Alert alert = driver.switchTo().alert();
	  
	  System.out.println("Alert message if user is not entering user details: "
	                           +alert.getText());
		
	  String text = alert.getText();
		
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert messg");
		}
		else
			{
			System.out.println("in-correct alert messg");
			}
		
		alert.accept(); //click on OK btn
		
		//alert.dismiss(); //click on cancel btn
		
	}
	  
  }

