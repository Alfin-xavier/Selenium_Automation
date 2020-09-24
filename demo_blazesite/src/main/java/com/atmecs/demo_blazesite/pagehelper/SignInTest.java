package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.helper.Helpers;

public class SignInTest 
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;

	@Test
	  public void signUpTest() throws InterruptedException, IOException
	  {
		  
		  helpers.clickOperation(properties.getProperty("signin"));
			  
		  helpers.textbox(properties.getProperty("signinusername"), properties.getProperty("sname"));
		  
		  helpers.textbox(properties.getProperty("signinpassword"), properties.getProperty("spass"));

		  helpers.clickOperation(properties.getProperty("button1"));
		  
		  helpers.WaitAndSwitchToAlert();
			 
	  }
	  
}
