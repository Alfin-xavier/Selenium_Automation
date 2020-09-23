package com.atmecs.demo_automation.helper;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWindowPage 
{
	WebDriver driver;
	Properties properties;
	
	public HandlingWindowPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickingIcons(String xpath, String xpath1)
	{
		WebElement subdriver = driver.findElement(By.xpath(xpath));
		WebElement subdriver1 = subdriver.findElement(By.xpath(xpath1));
		for(int i=0;i<subdriver1.findElements(By.tagName("a")).size();i++)
		{
			String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
			subdriver1.findElements(By.tagName("a")).get(i).sendKeys(link);
		}
		
	}
	public void switchingTabs() 
	{
		// switching taps
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		// get the title of each tap
		while (itr.hasNext()) 
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}
}
