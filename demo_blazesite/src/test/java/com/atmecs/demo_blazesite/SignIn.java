package com.atmecs.demo_blazesite;

import java.io.IOException;

import com.atmecs.demo_blazesite.pagehelper.SignInTest;

public class SignIn 
{
	public void signIn() throws InterruptedException, IOException
	{
		SignInTest signin = new SignInTest();
		
		signin.signUpTest();
	}
}
