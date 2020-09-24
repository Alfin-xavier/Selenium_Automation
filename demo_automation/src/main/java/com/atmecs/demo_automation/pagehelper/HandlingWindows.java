package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.demo_automation.helper.Helpers;
import com.atmecs.demo_automation.utilities.UtilityFiles;

public class HandlingWindows 
{
	WebDriver driver;
	Properties properties;
	UtilityFiles dataprovider;
	Helpers helpers;
	
	@Test
	public void windowsHandling() throws IOException
	{
		
		helpers.clickingIcons(properties.getProperty("footer"), properties.getProperty("icons"));
		
		helpers.switchingTabs();
	}

}
