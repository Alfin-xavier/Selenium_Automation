package com.atmecs.automating_travelsite.pagehelper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class SearchingFlights 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public SearchingFlights(WebDriver driver)
	{
		this.driver = driver;
	}

	public void twoWayTripSelectionTest() throws InterruptedException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		data = PropertyReader.readProperties(Constants.DATAS);

		helpers.checkbox(locatorsFile.getProperty("roundtrip"));

		helpers.textData(locatorsFile.getProperty("source"), data.getProperty("sourcevalue"));

		helpers.textData(locatorsFile.getProperty("destination"), data.getProperty("destinationvalue"));

		helpers.clickOpertaion(locatorsFile.getProperty("date1"));

		helpers.clickOpertaion(locatorsFile.getProperty("departdate"));

		helpers.clickOpertaion(locatorsFile.getProperty("date2"));

		helpers.clickOpertaion(locatorsFile.getProperty("returndate"));

		helpers.clickOpertaion(locatorsFile.getProperty("checkbox"));

		helpers.clickOpertaion(locatorsFile.getProperty("searchflight"));

	}

}
