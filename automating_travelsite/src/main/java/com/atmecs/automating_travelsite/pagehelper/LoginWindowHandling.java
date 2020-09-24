package com.atmecs.automating_travelsite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.automating_travelsite.helpers.Helpers;

public class LoginWindowHandling 
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;
	
	@Test
	  public void handlingWindowTest() throws IOException, InterruptedException 
	  { 
		
		helpers.clickOpertaion(properties.getProperty("login"));

		helpers.clickOpertaion(properties.getProperty("gmail"));
		
		helpers.switchWindow();
	  
		helpers.textData(properties.getProperty("username"), properties.getProperty("name"));
		
		helpers.clickOpertaion(properties.getProperty("button1"));
		
		helpers.textData(properties.getProperty("userpassword"), properties.getProperty("password"));

		helpers.clickOpertaion(properties.getProperty("button2"));

	  }
	
	
}
