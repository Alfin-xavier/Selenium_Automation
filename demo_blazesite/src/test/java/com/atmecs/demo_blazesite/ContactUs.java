package com.atmecs.demo_blazesite;

import java.io.IOException;

import com.atmecs.demo_blazesite.pagehelper.ContactUsTest;

public class ContactUs 
{
	public void contactUs() throws InterruptedException, IOException
	{
		ContactUsTest contactus = new ContactUsTest();

		contactus.contactUsScript();
	}
}
