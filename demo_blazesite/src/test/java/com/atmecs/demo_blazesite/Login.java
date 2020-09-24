package com.atmecs.demo_blazesite;

import java.io.IOException;

import com.atmecs.demo_blazesite.pagehelper.LogInTest;

public class Login 
{
	public void logIn() throws InterruptedException, IOException
	{
		LogInTest login = new LogInTest();
		
		login.logInTest();
	}
}
