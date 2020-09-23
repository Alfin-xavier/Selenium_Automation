package com.atmecs.demo_blazesite.helper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage 
{
	WebDriver driver;
	Properties properties;
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void textData(String xpath, String value)
	{
		 driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public void clickOperation(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void waitAndClickAlert()
	{
		  Wait<WebDriver> wait = new WebDriverWait(driver,5);
		  
		  wait.until(ExpectedConditions.alertIsPresent()) ;
		  
		  driver.switchTo().alert().accept();
	}
}
