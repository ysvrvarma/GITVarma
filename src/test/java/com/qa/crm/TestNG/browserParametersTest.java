package com.qa.crm.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class browserParametersTest  extends BaseTestParam{
	
 
	public WebDriver driver;

	@BeforeMethod
	@Parameters("Browser")
	  public void browserstart(String browsername) 
	  {
		initialization(browsername);
	  }
	

	  @AfterMethod
	  public void browserclose() {
		  d.quit();
	  }
 
 @Test
 public void titleTest() 
 {
	 
	 d.get("https://www.google.com");
	 String title = d.getTitle();
	 Assert.assertEquals(title, "Google");
 }
 

}
