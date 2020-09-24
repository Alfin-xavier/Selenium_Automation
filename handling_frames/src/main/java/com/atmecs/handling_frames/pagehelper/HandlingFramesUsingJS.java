// Handling frames using javascript

package com.atmecs.handling_frames.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import com.atmecs.handling_frames.helper.HelperClass;

public class HandlingFramesUsingJS 
{
	WebDriver driver;
	JavascriptExecutor js;
	Properties properties;
	HelperClass helperclass;

	@Test
	public void handlingFrameAndClickChatIconTest() throws InterruptedException, IOException
	{
		helperclass.switchToFrame(properties.getProperty("frame"));
		
		helperclass.jsMethods(properties.getProperty("chaticon"));
		
		helperclass.textDatas(properties.getProperty("username"), properties.getProperty("name"));

		helperclass.textDatas(properties.getProperty("mob"), properties.getProperty("number"));

		helperclass.textDatas(properties.getProperty("usermail"), properties.getProperty("gmail"));
		
		helperclass.clickOperation(properties.getProperty("checkbox"));

		helperclass.selectValueFromDropDown(properties.getProperty("client"), "index1_1");

		helperclass.clickOperation(properties.getProperty("button"));
		
	}
	
}
