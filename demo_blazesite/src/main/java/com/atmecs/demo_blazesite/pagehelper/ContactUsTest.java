package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helper.Helpers;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class ContactUsTest
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;

	public ContactUsTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void contactUsScript() throws InterruptedException, IOException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.clickOperation(locatorsFile.getProperty("contactUs"));
		
		helpers.textbox(locatorsFile.getProperty("recipientMail"), datas.getProperty("mailValue"));
		
		helpers.textbox(locatorsFile.getProperty("recipientName"), datas.getProperty("nameValue"));
		
		helpers.textbox(locatorsFile.getProperty("message"), datas.getProperty("messageValue"));
		
		helpers.clickOperation(locatorsFile.getProperty("button3"));
		 
		helpers.switchToAlert();
		 
		
	}
	
}
