package com.atmecs.automating_travelsite.helpers;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWindowHandlingPage 
{
	WebDriver driver;
	Properties properties;
	
	public LoginWindowHandlingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void textData(String xpath, String value)
	{
		 WebElement susername = driver.findElement(By.xpath(xpath));
		  susername.sendKeys(value);
	}
	public void clickOperation(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void switchWindow()
	{
		Set<String> ids = driver.getWindowHandles(); 
		Iterator<String> windows = ids.iterator();
		String parentWindow = windows.next();
		String childwindow = windows.next(); 
		driver.switchTo().window(childwindow);
	}
}
