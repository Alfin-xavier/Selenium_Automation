package com.atmecs.automating_travelsite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.dataprovider.DataProviders;
import com.atmecs.automating_travelsite.helpers.SearchingFlightsPage;

public class SearchingFlights {
	WebDriver driver;
	Properties properties;
	DataProviders dataprovider;
	SearchingFlightsPage searchingflights;

	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		searchingflights = new SearchingFlightsPage(driver);
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
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

	@AfterTest
	public void closingDriver() {
		driver.quit();
	}
}
