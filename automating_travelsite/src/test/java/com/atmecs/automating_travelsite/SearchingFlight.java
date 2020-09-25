package com.atmecs.automating_travelsite;

import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.pagehelper.SearchingFlights;

public class SearchingFlight extends BaseTest
{
	@Test
	public void searchingFlight() throws InterruptedException
	{
		SearchingFlights search = new SearchingFlights(driver);
		
		search.twoWayTripSelectionTest();
	}
	
}
