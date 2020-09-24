package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.helper.Helpers;

public class ContactUsTest
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;

	@Test
	public void contactUsScript() throws InterruptedException, IOException 
	{
		
		helpers.clickOperation(properties.getProperty("contactUs"));
		
		helpers.textbox(properties.getProperty("recipientMail"), properties.getProperty("mailValue"));
		
		helpers.textbox(properties.getProperty("recipientName"), properties.getProperty("nameValue"));
		
		helpers.textbox(properties.getProperty("message"), properties.getProperty("messageValue"));
		
		helpers.clickOperation(properties.getProperty("button3"));
		 
		helpers.switchToAlert();
		 
		
	}
	
}
