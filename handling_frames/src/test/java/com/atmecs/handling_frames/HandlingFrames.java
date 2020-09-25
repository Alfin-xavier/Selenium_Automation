package com.atmecs.handling_frames;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.handling_frames.basetest.BaseTest;
import com.atmecs.handling_frames.pagehelper.HandlingFramesUsingJS;

public class HandlingFrames extends BaseTest
{
	@Test
	public void handlingFrames() throws InterruptedException, IOException
	{
		HandlingFramesUsingJS frames = new HandlingFramesUsingJS(driver);
				
		frames.handlingFrameAndClickChatIconTest();
	}
}
