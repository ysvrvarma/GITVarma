package com.qa.crm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HeadLessBrowser {
  @Test
  public void HeadLessBrowserTest() throws Exception 
  {
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("window-size=1400,800");
	 options.addArguments("headless");
	 
	  WebDriver driver = new ChromeDriver(options); //launch firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html"); //enter URL
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("ysvrvarma");
		driver.findElement(By.name("password")).sendKeys("Varma.1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	  
  }
}
