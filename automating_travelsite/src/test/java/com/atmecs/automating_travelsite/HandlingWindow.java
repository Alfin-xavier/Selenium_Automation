package com.atmecs.automating_travelsite;

import java.io.IOException;

import com.atmecs.automating_travelsite.pagehelper.LoginWindowHandling;

public class HandlingWindow 
{
	public void handlinWindow() throws IOException, InterruptedException
	{
		LoginWindowHandling login = new LoginWindowHandling();

		login.handlingWindowTest();

	}
}
