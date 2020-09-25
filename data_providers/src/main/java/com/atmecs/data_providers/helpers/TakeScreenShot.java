package com.atmecs.data_providers.helpers;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.atmecs.data_providers.constants.Constants;

public class TakeScreenShot 
{
	WebDriver driver;
	
	public TakeScreenShot(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
		
		
	}
}
