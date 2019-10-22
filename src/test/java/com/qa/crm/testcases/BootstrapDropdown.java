package com.qa.crm.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown {
  @Test
  public void BootstDropdownTest() 
  {
	  
	  WebDriver driver = new FirefoxDriver(); //launch firefox
		
			driver.manage().window().maximize(); //maximize window
			driver.manage().deleteAllCookies(); //delete all the cookies
			
			//dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); //enter URL
			driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
			
			//List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label//input[@type='checkbox']"));
			
			//List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//descendant::a//input[@type='checkbox']"));
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multi')]//li//descendant::input"));
			
			for(int i=0;i<list.size();i++)
			{
				//boolean flag = list.get(i).isSelected();
				//System.out.println(list.get(i).getAttribute("value") +"-- " +flag);
				if(list.get(i).isSelected()==false)
				{
			       list.get(i).click();
			    }
			}
  }
}
