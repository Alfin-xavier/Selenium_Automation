package com.atmecs.demo_blazesite.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_blazesite.constants.Constants;

public class DataProviders 
{
	WebDriver driver;
	Properties properties;
	public DataProviders(WebDriver driver)
	{
		this.driver = driver;
	}
	public Properties dataProvider() throws IOException
	 {
		 FileInputStream locator = new FileInputStream(
					System.getProperty("user.dir") + Constants.LOCATORS);
					properties = new Properties();
					properties.load(locator);
					return properties;
					
	 }
	
}
