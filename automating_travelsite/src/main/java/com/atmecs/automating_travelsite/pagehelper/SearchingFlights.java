package com.atmecs.automating_travelsite.pagehelper;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.UtilitiesFiles;

public class SearchingFlights 
{
	WebDriver driver;
	Properties properties;
	UtilitiesFiles dataprovider;
	Helpers searchingflights;

	@Test
	public void twoWayTripSelectionTest() throws InterruptedException 
	{
		searchingflights.checkbox(properties.getProperty("roundtrip"));

		searchingflights.textData(properties.getProperty("source"), properties.getProperty("sourcevalue"));
		
		searchingflights.textData(properties.getProperty("destination"), properties.getProperty("destinationvalue"));
		
		searchingflights.clickOpertaion(properties.getProperty("date1"));
		
		searchingflights.clickOpertaion(properties.getProperty("departdate"));

		searchingflights.clickOpertaion(properties.getProperty("date2"));

		searchingflights.clickOpertaion(properties.getProperty("returndate"));
		
		searchingflights.clickOpertaion(properties.getProperty("checkbox"));

		searchingflights.clickOpertaion(properties.getProperty("searchflight"));

	}

}
