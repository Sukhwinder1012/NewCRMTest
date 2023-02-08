package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.base.TestBase;

public class RandomClasswithMain extends TestBase {
	
	public RandomClasswithMain() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomClasswithMain obj = new RandomClasswithMain();
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://freecrm.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
//		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//		driver.findElement(By.name("email")).sendKeys("sukhwinder101291.ss@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Winder@789");
//		driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
//		
//		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
//		
		WebElement twitterIcon = driver.findElement(By.xpath("//a[contains(@title,'Twitter @freeCRM')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(twitterIcon).build().perform();
		//act.moveToElement(home).build().perform();
//		//driver.findElement(By.xpath("//i[contains(@class,'plus inverted icon')]")).click();
		//driver.findElement(By.xpath("//a[contains(@href, '')]"))
		
		//driver.quit();
		
		char ch = ('o');
		String st3 = "Rockstar";
		
		
		
		
		
		
	}

}
