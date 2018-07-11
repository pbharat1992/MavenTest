package com.TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class TestNGScreenshotListenerConcept extends Base{
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	@Test
	public void LoginTest()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void ContactsTest()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void DealsTest()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void SearchTest()
	{
		Assert.assertEquals(false,true);
	}
	@Test
	public void HomepageTest()
	{
		Assert.assertEquals(false,true);
	}



}