package com.atmecs.demo_blazesite;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.SignInTest;
import com.atmecs.demo_blazesite.utilities.ReadDataFromExcel;

public class SignIn extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Login_Credentials");
		
		return data;
	}
	
	@Test
	public void signIn(String username, String password) throws InterruptedException, IOException
	{
		SignInTest signin = new SignInTest(driver);
		
		signin.signUpTest(username, password);
	}
}
