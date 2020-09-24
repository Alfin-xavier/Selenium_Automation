package com.atmesc.data_providers;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.data_providers.constants.Constants;
import com.atmecs.data_providers.helpers.TakeScreenShot;

public class FacebookLoginTest 
{
	WebDriver driver;
	Properties properties;
	TakeScreenShot takeScreenshot;
	
	@Test(dataProvider = "facebookLogin")
	public void loginTest(String username, String password) throws IOException 
	{
		
		System.setProperty(Constants.USER_DIR, Constants.CHROME_DIR);

		driver = new ChromeDriver();
		
		driver.get(Constants.SITE_URL);
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

		driver.findElement(By.xpath("//button[@name='login']")).click();

		System.out.println(driver.getTitle());

		TakeScreenShot.takeScreenshot(driver);

	}

	@DataProvider(name = "facebookLogin")
	public Object[][] datas() 
	{
		Object[][] data = new Object[2][2];

		data[0][0] = "abc@gmail.com";
		data[0][1] = "abc";

		data[1][0] = "def@gmail.com";
		data[1][1] = "def";

		return data;

	}

	@AfterTest
	public void closingDriver()
	{
		driver.quit();
	}

}
