package com.qa.crm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  
	  
  }
}
