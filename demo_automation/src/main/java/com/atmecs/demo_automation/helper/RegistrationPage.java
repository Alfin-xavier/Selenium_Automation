package com.atmecs.demo_automation.helper;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage 
{
	WebDriver driver;
	Properties properties;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void textData(String xpath, String value)
	{
		 WebElement susername = driver.findElement(By.xpath(xpath));
		  susername.sendKeys(value);
	}
	public void selectFromDropDown(String xpath, String value)
	{
		Select skills = new Select(driver.findElement(By.xpath(xpath)));
		skills.selectByValue(value);
	}
	public void clickingButton(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement submit = driver.findElement(By.xpath(xpath));
		
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		
		submit.click();
	}
	public void clickOperation(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void clickingCountry(String xpath)
	{
		for(int i=1;i<=4;i++)
			driver.findElement(By.xpath(xpath)).click();
			
	}

	
	
}
