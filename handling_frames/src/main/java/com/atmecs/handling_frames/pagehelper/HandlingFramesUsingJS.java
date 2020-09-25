// Handling frames using javascript

package com.atmecs.handling_frames.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import com.atmecs.handling_frames.constant.Constants;
import com.atmecs.handling_frames.helper.HelperClass;
import com.atmecs.handling_frames.utilities.PropertyReader;

public class HandlingFramesUsingJS 
{
	public WebDriver driver;

	HelperClass helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	public HandlingFramesUsingJS(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void handlingFrameAndClickChatIconTest() throws InterruptedException, IOException
	{
		helpers = new HelperClass(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.switchToFrame(locatorsFile.getProperty("frame"));
		
		helpers.jsMethods(locatorsFile.getProperty("chaticon"));
		
		helpers.textDatas(locatorsFile.getProperty("username"), datas.getProperty("name"));

		helpers.textDatas(locatorsFile.getProperty("mob"), datas.getProperty("number"));

		helpers.textDatas(locatorsFile.getProperty("usermail"), datas.getProperty("gmail"));
		
		helpers.clickOperation(locatorsFile.getProperty("checkbox"));

		helpers.selectValueFromDropDown(locatorsFile.getProperty("client"), "index1_1");

		helpers.clickOperation(locatorsFile.getProperty("button"));
		
	}
	
}
