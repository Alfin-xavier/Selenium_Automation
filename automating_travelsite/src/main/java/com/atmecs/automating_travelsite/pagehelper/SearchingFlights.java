package com.atmecs.automating_travelsite.pagehelper;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.automating_travelsite.helpers.Helpers;

public class SearchingFlights 
{
	WebDriver driver;
	Properties properties;
	Helpers helpers;

	@Test
	public void twoWayTripSelectionTest() throws InterruptedException 
	{
		helpers.checkbox(properties.getProperty("roundtrip"));

		helpers.textData(properties.getProperty("source"), properties.getProperty("sourcevalue"));
		
		helpers.textData(properties.getProperty("destination"), properties.getProperty("destinationvalue"));
		
		helpers.clickOpertaion(properties.getProperty("date1"));
		
		helpers.clickOpertaion(properties.getProperty("departdate"));

		helpers.clickOpertaion(properties.getProperty("date2"));

		helpers.clickOpertaion(properties.getProperty("returndate"));
		
		helpers.clickOpertaion(properties.getProperty("checkbox"));

		helpers.clickOpertaion(properties.getProperty("searchflight"));

	}

}
