package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
  
  @Test
  public void MouseOverTest() 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.actitime.com/");
	  
	  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Features')]"));
	  
	  Actions a=new Actions(driver);
	  a.moveToElement(element).build().perform();
	  
	  //Clicking "Team Management"
	  driver.findElement(By.xpath("//a[contains(text(),'Features')]//parent::li//following::li[1]//a[contains(text(),'Team')]")).click();
	
  }
}
