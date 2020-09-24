package com.atmecs.demo_blazesite.basetest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helper.Helpers;
import com.atmecs.demo_blazesite.utilities.UtilityFiles;

public class BaseTest 
{
	WebDriver driver;
	Properties properties;
	UtilityFiles utility;
	Helpers helpers;

	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		
		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		utility = new UtilityFiles(driver);
		properties = utility.dataProvider();
		helpers = new Helpers(driver);
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
