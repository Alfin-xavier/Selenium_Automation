package com.atmecs.data_providers.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.atmesc.data_providers.FacebookLoginTest;

public class TestNGListener extends FacebookLoginTest implements ITestListener 
{
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test has been Passed Successfully!!"+result.getTestName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		  { 
			  takeScreenshot("FacebookLoginError");
		  } 
		  catch(IOException e)
		  { 
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

