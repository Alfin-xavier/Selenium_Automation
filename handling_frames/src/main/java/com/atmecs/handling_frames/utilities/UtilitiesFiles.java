package com.atmecs.handling_frames.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.handling_frames.constant.Constants;

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
		FileInputStream datas = new FileInputStream(
				System.getProperty("user.dir") + Constants.DATAS);
		properties = new Properties();
		properties.load(datas);
		return properties;
	}
	
}
