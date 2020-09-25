package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.contants.Constants;
import com.atmecs.demo_automation.helper.Helpers;
import com.atmecs.demo_automation.utilities.PropertyReader;

public class RegistrationFormFilling 
{
public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public RegistrationFormFilling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void registerationTest() throws IOException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		data = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.textData(locatorsFile.getProperty("firstname"), data.getProperty("fname"));
		
		helpers.textData(locatorsFile.getProperty("lastname"), data.getProperty("lname"));
		
		helpers.textData(locatorsFile.getProperty("address"), data.getProperty("addressvalue"));
		
		helpers.textData(locatorsFile.getProperty("gmail"), data.getProperty("mail"));
		
		helpers.textData(locatorsFile.getProperty("mob"), data.getProperty("number"));
		
		helpers.clickingButton(locatorsFile.getProperty("gender"));
		
		helpers.clickingButton(locatorsFile.getProperty("hobbies"));
		
		helpers.clickingButton(locatorsFile.getProperty("language"));
		
		helpers.clickingCountry(locatorsFile.getProperty("multiselect"));
		
		helpers.selectFromDropDown(locatorsFile.getProperty("skills"), "PHP");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("countries"), "India");
		
		helpers.clickOperation(locatorsFile.getProperty("selectcountry"));
		
		helpers.clickOperation(locatorsFile.getProperty("country"));
		
		helpers.selectFromDropDown(locatorsFile.getProperty("year"), "1996");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("month"), "August");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("date"), "11");
		
		helpers.textData(locatorsFile.getProperty("password"), data.getProperty("passvalue1"));
		
		helpers.textData(locatorsFile.getProperty("confirmpass"), data.getProperty("passvalue2"));
		
		helpers.clickingButton(locatorsFile.getProperty("submit"));

	}
	
}
