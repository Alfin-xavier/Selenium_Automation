package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.demo_automation.helper.Helpers;
import com.atmecs.demo_automation.utilities.UtilityFiles;

public class RegistrationFormFilling 
{
	WebDriver driver;
	Properties properties;
	UtilityFiles dataprovider;
	Helpers helpers;
	
	@Test
	public void registerationTest() throws IOException 
	{
		helpers.textData(properties.getProperty("firstname"), properties.getProperty("fname"));
		
		helpers.textData(properties.getProperty("lastname"), properties.getProperty("lname"));
		
		helpers.textData(properties.getProperty("address"), properties.getProperty("addressvalue"));
		
		helpers.textData(properties.getProperty("gmail"), properties.getProperty("mail"));
		
		helpers.textData(properties.getProperty("mob"), properties.getProperty("number"));
		
		helpers.clickingButton(properties.getProperty("gender"));
		
		helpers.clickingButton(properties.getProperty("hobbies"));
		
		helpers.clickingButton(properties.getProperty("language"));
		
		helpers.clickingCountry(properties.getProperty("multiselect"));
		
		helpers.selectFromDropDown(properties.getProperty("skills"), "PHP");
		
		helpers.selectFromDropDown(properties.getProperty("countries"), "India");
		
		helpers.clickOperation(properties.getProperty("selectcountry"));
		
		helpers.clickOperation(properties.getProperty("country"));
		
		helpers.selectFromDropDown(properties.getProperty("year"), "1996");
		
		helpers.selectFromDropDown(properties.getProperty("month"), "August");
		
		helpers.selectFromDropDown(properties.getProperty("date"), "11");
		
		helpers.textData(properties.getProperty("password"), properties.getProperty("passvalue1"));
		
		helpers.textData(properties.getProperty("confirmpass"), properties.getProperty("passvalue2"));
		
		helpers.clickingButton(properties.getProperty("submit"));

	}
	
}
