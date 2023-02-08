package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PreLoginPage extends TestBase {
	
	Actions act = new Actions(driver);

	@FindBy(xpath = "//a[contains(@title,'Twitter @freeCRM')]")
	WebElement twitterIcon;
	
	
	
	
	
	public PreLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTwitterIcon() {
		act.moveToElement(twitterIcon).build().perform();
//		WebElement desiredTwitterIcon = driver.switchTo().activeElement();
//		if(desiredTwitterIcon==twitterIcon) {
//			return true;
//		}else 
//		{
//			return false;
//		}
	}
	
}
