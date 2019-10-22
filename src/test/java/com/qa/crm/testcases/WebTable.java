package com.qa.crm.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable {
  @Test
  public void webTable() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	  List<WebElement> tRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	  for(int i=2;i<=tRows.size();i++)
	  {
		 List<WebElement> tCols = driver.findElements(By.xpath("//table[@id='customers']//tr[" +i+ "]/td"));
		 for(int j=1;j<=tCols.size();j++)
		 {
			String cData = driver.findElement(By.xpath("//table[@id='customers']//tr[" +i+ "]/td[" +j+"]")).getText();
			System.out.print(cData +"  ");
		 }
		 
		 System.out.println();
	  }
  }
}
