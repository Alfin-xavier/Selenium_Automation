package com.atmecs.demo_blazesite.pagehelper;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.helper.Helpers;

public class AddProductToCartTest
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;
	
	@Test 
	public void selectAndAddToCartProduct() throws InterruptedException 
	{ 
		helpers.clickOperation(properties.getProperty("selectProduct1"));

		helpers.clickOperation(properties.getProperty("helpers1"));

		helpers.WaitAndSwitchToAlert();

		helpers.clickOperation(properties.getProperty("clickCart"));
		 
	}
	
}
