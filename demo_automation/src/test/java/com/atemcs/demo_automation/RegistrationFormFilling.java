package com.atemcs.demo_automation;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.demo_automation.contants.Constants;
import com.atmecs.demo_automation.datarovider.DataProviders;
import com.atmecs.demo_automation.helper.RegistrationPage;


public class RegistrationFormFilling 
{
	WebDriver driver;
	Properties properties;
	DataProviders dataprovider;
	RegistrationPage registration;
	
	@BeforeTest
	public void settingAndLaunchingDriver() throws IOException 
	{
		
		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		registration = new RegistrationPage(driver);
		dataprovider = new DataProviders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void registerationTest() throws IOException 
	{
		registration.textData(properties.getProperty("firstname"), properties.getProperty("fname"));
		registration.textData(properties.getProperty("lastname"), properties.getProperty("lname"));
		registration.textData(properties.getProperty("address"), properties.getProperty("addressvalue"));
		registration.textData(properties.getProperty("gmail"), properties.getProperty("mail"));
		registration.textData(properties.getProperty("mob"), properties.getProperty("number"));
		registration.clickingButton(properties.getProperty("gender"));
		registration.clickingButton(properties.getProperty("hobbies"));
		registration.clickingButton(properties.getProperty("language"));
		registration.clickingCountry(properties.getProperty("multiselect"));
		registration.selectFromDropDown(properties.getProperty("skills"), "PHP");
		registration.selectFromDropDown(properties.getProperty("countries"), "India");
		registration.clickOperation(properties.getProperty("selectcountry"));
		registration.clickOperation(properties.getProperty("country"));
		registration.selectFromDropDown(properties.getProperty("year"), "1996");
		registration.selectFromDropDown(properties.getProperty("month"), "August");
		registration.selectFromDropDown(properties.getProperty("date"), "11");
		registration.textData(properties.getProperty("password"), properties.getProperty("passvalue1"));
		registration.textData(properties.getProperty("confirmpass"), properties.getProperty("passvalue2"));
		registration.clickingButton(properties.getProperty("submit"));

	}
	
	@AfterTest
	public void closingDriver()
	{
		driver.close();
	}
}
