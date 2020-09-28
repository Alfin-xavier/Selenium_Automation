package com.atmecs.demo_blazesite.utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{
	public WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName()+"Executed Successfully!!");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName()+"Failed!!");

		try 
		{
			TakeScreenshots.takeScreenshot(driver, "errorpage");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Skipped TestCase:"+result.getTestName());
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
