package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;	
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	
	public HomePageTest() {
		super();
	}
	
	
	//Test cases should be separated -- independent from each other.
	//Before each test case -- launch browser and login.
	//@Test -- execute the test case.
	//After each test case -- close the browser.
	
	@BeforeMethod
	public void setUp() {
		initialization();
			loginPage = new LoginPage();
			contactsPage = new ContactsPage();
			dealsPage = new DealsPage();
			tasksPage = new TasksPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "HomePage title not matched");
	}
	
	@Test(priority = 2)
	public void verifyCorrectUserNameTest() {
		Boolean correctUserNameTitle = homePage.verifyCorrectUserName();
		Assert.assertTrue(correctUserNameTitle);
	}
	
	@Test(priority = 3)
	public void verifyContactsLinkTest() {
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority = 4)
	public void verifyDealsLinkTest() {
		dealsPage = homePage.clickOnDealsLink();
	}
	
	@Test(priority = 5)
	public void verifyTasksLinkTest() {
		tasksPage = homePage.clickOnTasksLink();
	}
	
	@Test(priority=6)
	public void verifyClickOnNewContactsLink() {
		contactsPage = homePage.clickOnNewContactsLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
	
}
