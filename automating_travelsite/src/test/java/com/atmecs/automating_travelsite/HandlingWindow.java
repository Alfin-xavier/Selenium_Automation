package com.atmecs.automating_travelsite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.pagehelper.LoginWindowHandling;

public class HandlingWindow extends BaseTest
{
	
	@Test
	public void handlinWindow() throws IOException, InterruptedException
	{
		LoginWindowHandling login = new LoginWindowHandling();

		login.handlingWindowTest();

	}
}
