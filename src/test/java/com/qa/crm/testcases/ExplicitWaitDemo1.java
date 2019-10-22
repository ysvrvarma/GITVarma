package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo1 {
  @Test
  public void ExplicitWaitTestDemo1() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
	  By locat = By.xpath("//p[text()='WebDriver']");
	  
	  boolean isPresent = explicitWaitElemnt(driver, locat, 20);
	// if else condition
			if (isPresent) {
				System.out.println("===== WebDriver is visible======");
			} else {
				System.out.println("===== WebDriver is not visible======");
			}
  }
  
  public static boolean explicitWaitElemnt(WebDriver driver, By locator ,int timeout )
  {
	  WebElement element = new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
	  boolean status = element.isDisplayed();
	  return status;
  }
}
