package com.atmecs.dataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;

	@AfterTest
	public void luanchingBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

	}

	@Test(dataProvider = "facebookLogin")
	public void loginTest(String username, String password) 
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("username");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");

		driver.findElement(By.xpath("//button[@name='login']")).click();

		driver.close();

	}

	@DataProvider(name = "facebookLogin")
	public Object[][] datas() 
	{
		Object[][] data = new Object[2][2];

		data[0][0] = "sad@gmail.com";
		data[0][1] = "abc@11";

		data[1][0] = "abc@gmail.com";
		data[1][1] = "abc@11";

		return data;

	}

}
