package com.atmecs.demo_automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.contants.Constants;

public class TakeScreenshots 
{
	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
		
	}
}
