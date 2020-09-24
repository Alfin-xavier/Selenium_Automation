package com.atmecs.automating_travelsite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.UtilitiesFiles;

public class LoginWindowHandling 
{
	WebDriver driver;
	Properties properties;
	UtilitiesFiles dataprovider;
	Helpers windowhandling;
	
	@Test
	  public void handlingWindowTest() throws IOException, InterruptedException 
	  { 
		
		windowhandling.clickOpertaion(properties.getProperty("login"));

		windowhandling.clickOpertaion(properties.getProperty("gmail"));
		
		windowhandling.switchWindow();
	  
		windowhandling.textData(properties.getProperty("username"), properties.getProperty("name"));
		
		windowhandling.clickOpertaion(properties.getProperty("button1"));
		
		windowhandling.textData(properties.getProperty("userpassword"), properties.getProperty("password"));

		windowhandling.clickOpertaion(properties.getProperty("button2"));

	  }
	
	
}
