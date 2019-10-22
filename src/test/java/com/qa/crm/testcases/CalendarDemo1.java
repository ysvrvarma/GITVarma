package com.qa.crm.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalendarDemo1 {
  @Test
  public void CalendarDemoTesting() 
  {
	  WebDriver driver = new FirefoxDriver(); //launch firefox
		
	  driver.manage().window().maximize(); //maximize window
	  driver.manage().deleteAllCookies(); //delete all the cookies
			
			//dynamic wait
	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   driver.get("https://www.redbus.in/");
	   driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
	   String calMonth=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
	   
	   System.out.println("DDDDDD" +calMonth);
	   
	   List<WebElement> rows = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']//descendant::tr"));
	   
	   System.out.println(rows.size());
  }
}
