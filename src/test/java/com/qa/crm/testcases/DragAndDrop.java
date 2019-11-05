package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
  @Test
  public void DragAndDropTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.switchTo().frame(0);
	  
	  Actions ac = new Actions(driver);
	  
	  ac.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
	//  ac.dragAndDrop(source, target)
	  
  }
}
