package com.qa.crm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebtableDynamic {
  @Test
  public void WebtableDynamicTest() throws Exception {
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
		
		//Method-1:
			String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
			String after_xpath = "]/td[2]/a";
			
			for(int i=4; i<=5; i++){
				String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
				System.out.println(name);
				if(name.contains("surya")){ //i=6
					//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
					driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
				}
			}
			
			//Method-2:
			//driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();

		
		
  }
}
