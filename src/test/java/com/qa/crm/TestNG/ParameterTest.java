package com.qa.crm.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  
	@Parameters({"browser","url","username","password"})
	@Test 
  public void ParameterTesting(String browser, String url, String username,String password) 
	{
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
  }
}
