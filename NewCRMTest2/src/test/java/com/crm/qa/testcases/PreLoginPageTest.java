package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.PreLoginPage;

public class PreLoginPageTest extends TestBase {

	PreLoginPage preLoginPage;
	
	public PreLoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		preLoginPage = new PreLoginPage();
		
		
	}
	
	@Test
	public void verifyTwitterIconTest() {
		preLoginPage.verifyTwitterIcon();
		//Assert.assertTrue(b1);
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
}
