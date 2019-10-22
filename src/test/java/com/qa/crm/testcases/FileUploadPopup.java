package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {
  @Test
  public void HandleFileUploadPopup() 
  {
	//1. alerts -- JavaScript Pop UP-- Alert API (accept, dismiss)
	//2. File Upload pop up -- Browse Button (type = file, sendKeys(path)
	//3. Browser Window Popup - Advertisement pop up (windowHandler API - getWindowHandles() )
	  WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Varma\\Desktop\\Selenium\\sShot.jpg");
	  
  }
}
