package com.atemcs.demo_automation;

import java.io.IOException;

import com.atmecs.demo_automation.pagehelper.RegistrationFormFilling;

public class Registration 
{
	public void registration() throws IOException
	{
		RegistrationFormFilling form = new RegistrationFormFilling();
		
		form.registerationTest();
	}
}
