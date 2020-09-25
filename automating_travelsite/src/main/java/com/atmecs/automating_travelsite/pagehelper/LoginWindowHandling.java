package com.atmecs.automating_travelsite.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class LoginWindowHandling 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public LoginWindowHandling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	  public void handlingWindowTest() throws IOException, InterruptedException 
	  { 
		 helpers = new Helpers(driver);
		 
		 locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		 
		 data = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.clickOpertaion(locatorsFile.getProperty("login"));

		helpers.clickOpertaion(locatorsFile.getProperty("gmail"));
		
		helpers.switchWindow();
	  
		helpers.textData(locatorsFile.getProperty("username"), data.getProperty("name"));
		
		helpers.clickOpertaion(locatorsFile.getProperty("button1"));
		
		helpers.textData(locatorsFile.getProperty("userpassword"), data.getProperty("password"));

		helpers.clickOpertaion(locatorsFile.getProperty("button2"));

	  }
}
