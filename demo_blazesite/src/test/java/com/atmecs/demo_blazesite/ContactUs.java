package com.atmecs.demo_blazesite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.ContactUsTest;

public class ContactUs extends BaseTest
{
	@Test
	public void contactUs() throws InterruptedException, IOException
	{
		ContactUsTest contactus = new ContactUsTest(driver);

		contactus.contactUsScript();
	}
}
