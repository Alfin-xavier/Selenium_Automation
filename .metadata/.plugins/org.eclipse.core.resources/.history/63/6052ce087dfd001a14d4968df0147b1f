package com.atmecs.automating_travelsite;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.dataprovider.DataProviders;
import com.atmecs.automating_travelsite.helpers.LoginWindowHandlingPage;


public class LoginWindowHandling 
{
	WebDriver driver;
	Properties properties;
	DataProviders dataprovider;
	LoginWindowHandlingPage windowhandling;
	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		System.setProperty(Constants.USER_DIR, Constants.CHROME_PATH);
		driver = new ChromeDriver();
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		windowhandling = new LoginWindowHandlingPage(driver);
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test(priority=2) 
	  public void handlingWindowTest() throws IOException, InterruptedException 
	  { 
		
		windowhandling.clickOperation(properties.getProperty("login"));

		windowhandling.clickOperation(properties.getProperty("gmail"));
		
		windowhandling.switchWindow();
	  
		windowhandling.textData(properties.getProperty("username"), properties.getProperty("name"));
		
		windowhandling.clickOperation(properties.getProperty("button1"));
		
		windowhandling.textData(properties.getProperty("userpassword"), properties.getProperty("password"));

		windowhandling.clickOperation(properties.getProperty("button2"));

	  }
	
	 @AfterTest 
	  public void closingDriver() 
	  {
		  driver.close();
	  }
}
