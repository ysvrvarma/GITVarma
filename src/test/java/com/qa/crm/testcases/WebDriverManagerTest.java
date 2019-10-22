package com.qa.crm.testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
  @Test
  public void f() 
  {
	  //WebDriverManager.chromedriver().setup();
	  WebDriverManager.chromedriver().version("76.0.3809.126").setup(); //current version of chrome is 77 but we are using 76.
	  WebDriver driver = new ChromeDriver(); //launch chrome
	  
			driver.get("https://classic.crmpro.com/index.html");
			driver.manage().window().maximize();
			driver.getTitle();
			
			List<String> list = WebDriverManager.chromedriver().getVersions();
			Iterator<String> it = list.iterator();
			System.out.println("No of chromedriver versios is " +list.size());
			int i=0;
			while(it.hasNext())
			{
				String data = list.get(i).toString();
				System.out.println(data);
				it.next();
				i++;
				
				
			}
			System.out.println("No of chromedriver versios is (by using hasnext() " +i);
			
  }
}
