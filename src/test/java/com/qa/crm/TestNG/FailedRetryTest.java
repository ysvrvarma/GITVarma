package com.qa.crm.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedRetryTest {
	
	@Test
	public void Test1()
	{
		System.out.println("Failed Test1");
		Assert.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		System.out.println("Failed Test2");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		System.out.println(":Passed Test");
		Assert.assertEquals(true, true);
	}
	
	
}
