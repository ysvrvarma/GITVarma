package com.qa.crm.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotBase 
{
 public static WebDriver d;
  
  public static  void initialization() 
  {
	  d= new ChromeDriver();
	  d.get("https://www.google.com");
	  d.manage().window().maximize();
  }
  
  
  public static void failedScreenshot(String testMethodName)
  {
	
	File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(source, new File("./Screenshots/" +testMethodName+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
  }
}
