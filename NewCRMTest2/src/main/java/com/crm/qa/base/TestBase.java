package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\sukhw_q5yedax.INBOOK_X1_SLIM"
					+ "\\eclipse-workspace\\NewMRCTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Selenium Automation\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Automation\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
}
