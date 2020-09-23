package com.atmecs.demo_blazesite.helper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;
	Properties properties;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void textData(String xpath, String value)
	{
		 WebElement lusername = driver.findElement(By.xpath(xpath));
		  lusername.sendKeys(value);
	}
	public void clickOperation(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
}
