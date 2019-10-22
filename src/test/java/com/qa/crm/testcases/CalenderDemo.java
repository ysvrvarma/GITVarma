package com.qa.crm.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalenderDemo {
  @Test
  public void CalenderSelection() 
  {
		  WebDriver driver = new FirefoxDriver(); //launch firefox
			
		  driver.manage().window().maximize(); //maximize window
		  driver.manage().deleteAllCookies(); //delete all the cookies
				
				//dynamic wait
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   driver.get("https://www.redbus.in/");
		   driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		   
		   List<WebElement> rows = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']//descendant::tr"));
		   
		   System.out.println(rows.size());
		   
		   
		   //selecting september 28--current date sept 27th
		   driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//descendant::tr[7]/td[6]")).click();
		   
		 ////*[@id='rb-calendar_onward_cal']//descendant::tr[7]/td[6]
		  
		   //driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//descendant::td[2][@class='monthTitle']"));
		   
		  // driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//descendant::td[2][@class='monthTitle']"));
		   //driver.findElement(By.xpath("//td[@class='current day'][contains(text(),'28')]")).click();
		   //driver.quit();
		   
		 //table[@class='rb-monthTable first last']//descendant::td[2][@class='monthTitle']
		 
  }
}
