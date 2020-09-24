package com.atmecs.automating_travelsite;

import com.atmecs.automating_travelsite.pagehelper.SearchingFlights;

public class SearchingFlight 
{
	public void searchingFlights() throws InterruptedException
	{
		SearchingFlights search = new SearchingFlights();
		
		search.twoWayTripSelectionTest();
	}
	
}
