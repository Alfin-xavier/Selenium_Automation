package com.atmecs.demo_automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import com.atmecs.demo_automation.contants.Constants;

public class UtilityFiles
{
	WebDriver driver;
	Properties properties;
	public UtilityFiles(WebDriver driver)
	{
		this.driver = driver;
	}
	public Properties dataProvider() throws IOException
	 {
		 FileInputStream locator = new FileInputStream(
					System.getProperty("user.dir") + Constants.DATAS);
					properties = new Properties();
					properties.load(locator);
					return properties;
					
	 }


}
