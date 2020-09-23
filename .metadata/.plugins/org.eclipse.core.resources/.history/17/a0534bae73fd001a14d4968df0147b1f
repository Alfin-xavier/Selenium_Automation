package com.atmecs.demo_automation.datarovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

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
					System.getProperty("user.dir") + "\\src\\main\\resources\\datas\\testdatas.properties");
					properties = new Properties();
					properties.load(locator);
					return properties;
					
	 }


}
