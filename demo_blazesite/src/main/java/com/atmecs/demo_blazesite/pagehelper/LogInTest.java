package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helper.Helpers;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class LogInTest 
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;

	public LogInTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void logInTest() throws InterruptedException, IOException 

	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);

		helpers.clickOperation(locatorsFile.getProperty("login"));

		helpers.textbox(locatorsFile.getProperty("lusername"), datas.getProperty("lname"));

		helpers.textbox(locatorsFile.getProperty("lpassword"), datas.getProperty("lpass"));

		helpers.clickOperation(locatorsFile.getProperty("button2"));

	}
}
