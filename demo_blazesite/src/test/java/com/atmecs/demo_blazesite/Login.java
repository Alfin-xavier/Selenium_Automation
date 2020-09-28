package com.atmecs.demo_blazesite;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.LogInTest;
import com.atmecs.demo_blazesite.utilities.ReadDataFromExcel;

public class Login extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Login_Credentials");
		
		return data;
	}
	
	@Test
	public void logIn(String username, String password) 
	{
		LogInTest login = new LogInTest(driver);
		
		try 
		{
			login.logInTest(username, password);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
