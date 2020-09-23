package com.atmecs.demo_blazesite.helper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage 
{
	WebDriver driver;
	Properties properties;
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickOperation(String xpath)
	{
		WebElement contactUs = driver.findElement(By.xpath(xpath));
		contactUs.click();
	}
	public void textbox(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public void switchToAlert()
	{
		driver.switchTo().alert().accept();
	}
	
}
