package com.atmecs.demo_automation.datarovider;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.atmecs.demo_automation.contants.Constants;
import com.atmecs.demo_automation.helper.HandlingWindowPage;
import com.atmecs.demo_automation.helper.RegistrationPage;

public class LaunchingBrowser 
{
	WebDriver driver;
	Properties properties;
	DataProviders dataprovider;
	HandlingWindowPage handlingwindow;
	RegistrationPage registration;
	
	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		
		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		handlingwindow = new HandlingWindowPage(driver);
		registration = new RegistrationPage(driver);
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void closingDriver() 
	{
		driver.close();
	}
}
