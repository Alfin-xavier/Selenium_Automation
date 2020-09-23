// Handling frames using javascript

package com.atmecs.handling_frames;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.atmecs.handling_frames.constant.Constants;
import com.atmecs.handling_frames.dataprovider.DataLoaders;
import com.atmecs.handling_frames.helper.HelperClass;

public class HandlingFramesUsingJS 
{
	WebDriver driver;
	JavascriptExecutor js;
	Properties properties;
	HelperClass helperclass;
	DataLoaders dataprovider; 

	@BeforeTest
	public void settingAndLaunchingDriver() throws InterruptedException, IOException 
	{

		System.setProperty(Constants.USER_DIR , Constants.CHROME_PATH);
		driver = new ChromeDriver();
		helperclass = new HelperClass(driver);
		dataprovider = new DataLoaders(driver);
		properties = dataprovider.dataProvider();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

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
	
	@AfterTest
	public void closingDriver() 
	{
		driver.close();
	}
}
