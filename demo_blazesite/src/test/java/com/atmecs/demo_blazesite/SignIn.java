package com.atmecs.demo_blazesite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.SignInTest;

public class SignIn extends BaseTest
{
	@Test
	public void signIn() throws InterruptedException, IOException
	{
		SignInTest signin = new SignInTest(driver);
		
		signin.signUpTest();
	}
}
