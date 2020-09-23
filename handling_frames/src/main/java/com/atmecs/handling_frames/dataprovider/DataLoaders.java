package com.atmecs.handling_frames.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DataLoaders 
{
	WebDriver driver;
	Properties properties;
	public DataLoaders(WebDriver driver)
	{
		this.driver = driver;
	}
	public Properties dataProvider() throws IOException 
	{
		FileInputStream datas = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\datas\\testdatas.properties");
		properties = new Properties();
		properties.load(datas);
		return properties;
	}
	
}
