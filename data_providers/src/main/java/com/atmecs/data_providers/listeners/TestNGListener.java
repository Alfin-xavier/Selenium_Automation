package com.atmecs.data_providers.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.atmecs.data_providers.helpers.TakeScreenShot;

public class TestNGListener implements ITestListener
{
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test has Passed Successfully!!");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		{
			TakeScreenShot.takeScreenshot(driver, "FacebookLoginError");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
	}
	
}

