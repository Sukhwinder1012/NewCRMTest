package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory -- OR
	@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginBtn;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class = 'ui fluid large blue submit button']")
	WebElement loginBtn1;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	@FindBy(xpath = "//a[contains(@class,'brand-name')]")
	WebElement crmLogo;
	
	//Initializing the page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCrmImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		loginBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn1.click();
		
		return new HomePage();
	}
	
	
	
}
