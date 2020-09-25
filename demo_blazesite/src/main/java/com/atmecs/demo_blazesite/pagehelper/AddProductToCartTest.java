package com.atmecs.demo_blazesite.pagehelper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helper.Helpers;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class AddProductToCartTest
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	public AddProductToCartTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void selectAndAddToCartProduct() throws InterruptedException 
	{ 
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		helpers.clickOperation(locatorsFile.getProperty("selectProduct1"));

		helpers.clickOperation(locatorsFile.getProperty("helpers1"));

		helpers.WaitAndSwitchToAlert();

		helpers.clickOperation(locatorsFile.getProperty("clickCart"));
		 
	}
	
}
