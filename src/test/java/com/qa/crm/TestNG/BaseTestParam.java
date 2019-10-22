package com.qa.crm.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTestParam 
{
	 public static WebDriver d;
	
	 
	 
	 
	 public static  void initialization(String browser) 
	  {
		 if(browser.equalsIgnoreCase("chrome"))
	     {
			 
			  d=new ChromeDriver();
			  
			 d.manage().window().maximize();
			 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 d=new FirefoxDriver();
			 d.manage().window().maximize();
		 }
	  }
  

}
