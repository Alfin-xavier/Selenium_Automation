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
import com.atmecs.demo_blazesite.helper.AddProductPage;

public class AddProductToCartTest
{
	WebDriver driver;
	Properties properties;
	AddProductPage addproduct;
	DataProviders dataprovider;
	
	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		addproduct = new AddProductPage(driver);
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test 
	public void selectAndAddToCartProduct() throws InterruptedException 
	{ 
		addproduct.clickOperation(properties.getProperty("selectProduct1"));

		addproduct.clickOperation(properties.getProperty("addProduct1"));

		addproduct.WaitAndSwitchToAlert();

		addproduct.clickOperation(properties.getProperty("clickCart"));
		 
	}
	
	 @AfterTest 
	  public void closingDriver() 
	  {
		  driver.quit();
	  }
}
