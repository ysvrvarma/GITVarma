package com.qa.crm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void FrameHandlingTest() throws Exception 
  {
	  WebDriver driver = new FirefoxDriver(); //launch firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html"); //enter URL
		
		driver.findElement(By.name("username")).sendKeys("ysvrvarma");
		driver.findElement(By.name("password")).sendKeys("Varma.1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
  }
}
