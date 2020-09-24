package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.helper.Helpers;

public class LogInTest 
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;
	
	 @Test
	  public void logInTest() throws InterruptedException, IOException 
	  {
		 helpers.clickOperation(properties.getProperty("login"));
			
		 helpers.textbox(properties.getProperty("lusername"), properties.getProperty("lname"));
		 
		 helpers.textbox(properties.getProperty("lpassword"), properties.getProperty("lpass"));
		  
		 helpers.clickOperation(properties.getProperty("button2"));
		 
	  }
}
