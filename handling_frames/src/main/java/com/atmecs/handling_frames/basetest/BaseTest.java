package com.atmecs.handling_frames.basetest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.atmecs.handling_frames.constant.Constants;
import com.atmecs.handling_frames.helper.HelperClass;
import com.atmecs.handling_frames.utilities.UtilitiesFiles;

public class BaseTest
{
	WebDriver driver;
	Properties properties;
	HelperClass helpers;
	UtilitiesFiles utility;
	
	@BeforeTest
	public void settingAndLaunchingDriver() throws InterruptedException, IOException 
	{

		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		helpers = new HelperClass(driver);
		utility = new UtilitiesFiles(driver);
		properties = utility.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void closingDriver() 
	{
		driver.close();
	}
}
