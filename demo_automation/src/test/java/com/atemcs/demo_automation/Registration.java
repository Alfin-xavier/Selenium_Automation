package com.atemcs.demo_automation;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.demo_automation.basetest.BaseTest;
import com.atmecs.demo_automation.pagehelper.RegistrationFormFilling;

public class Registration extends BaseTest
{
	@Test
	public void registration() throws IOException
	{
		RegistrationFormFilling form = new RegistrationFormFilling(driver);
		
		form.registerationTest();
	}
}
