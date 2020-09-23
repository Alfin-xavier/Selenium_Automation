package com.atmecs.automating_travelsite.helpers;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchingFlightsPage 
{
	WebDriver driver;
	Properties properties;
	
	public SearchingFlightsPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void textData(String xpath, String value)
	{
		 WebElement susername = driver.findElement(By.xpath(xpath));
		  susername.sendKeys(value);
	}
	public void clickOpertaion(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void selectFromDropDown(String xpath, String value)
	{
		 Select cabinclass = new Select(driver.findElement(By.id(xpath)));
		 cabinclass.selectByValue(value);
	}
	public void locatePath(String xpath)
	{
		driver.findElement(By.xpath(xpath));
	}
	public void checkbox(String xpath) 
	{
		WebElement returntrip = driver.findElement(By.xpath(xpath));
		  if(returntrip.isSelected()==false)
			  returntrip.click();
	}
	public void cabinClass(String xpath)
	{
		Wait<WebDriver> wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
		driver.findElement(By.xpath(xpath)).click();
	}
}
