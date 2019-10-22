package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
  @Test
  public void ExplicitWaitTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  

	
	  WebElement element =  wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	 
	  boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}
	  
  }
}
