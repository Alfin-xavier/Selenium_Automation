package com.atmecs.automating_travelsite.baseFiles;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.UtilitiesFiles;

public class BaseTest 
{
	WebDriver driver;
	Helpers helpers;
	Properties properties;
	UtilitiesFiles dataprovider;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException 
	{
		System.setProperty(Constants.USER_DIR, Constants.CHROME_PATH);
		driver = new ChromeDriver();
		helpers = new Helpers(driver);
		dataprovider = new UtilitiesFiles(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() 
	{
		driver.close();

	}
}
