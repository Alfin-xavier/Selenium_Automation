package com.atmecs.demo_blazesite;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.dataprovider.DataProviders;
import com.atmecs.demo_blazesite.helper.LoginPage;

public class LogInTest 
{
	WebDriver driver;
	Properties properties;
	LoginPage loginpage;
	DataProviders dataprovider;
	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	 @Test
	  public void logInTest() throws InterruptedException, IOException 
	  {
		 loginpage.clickOperation(properties.getProperty("login"));
			
		 loginpage.textData(properties.getProperty("lusername"), properties.getProperty("lname"));
		 
		 loginpage.textData(properties.getProperty("lpassword"), properties.getProperty("lpass"));
		  
		 loginpage.clickOperation(properties.getProperty("button2"));
		 
	  }
	
	 @AfterTest 
	  public void closingDriver() 
	  {
		  driver.close();
	  }
}
