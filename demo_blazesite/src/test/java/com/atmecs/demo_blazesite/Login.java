package com.atmecs.demo_blazesite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.LogInTest;

public class Login extends BaseTest
{
	@Test
	public void logIn() throws InterruptedException, IOException
	{
		LogInTest login = new LogInTest(driver);
		
		login.logInTest();
	}
}
