package com.atmecs.automating_travelsite.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.automating_travelsite.constants.Constants;

public class UtilitiesFiles 
{
	WebDriver driver;
	 Properties properties;
	 
	public UtilitiesFiles(WebDriver driver)
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
