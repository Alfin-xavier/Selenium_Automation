package com.atmecs.handling_frames;

import java.io.IOException;

import com.atmecs.handling_frames.pagehelper.HandlingFramesUsingJS;

public class HandlingFrames
{
	public void handlingFrames() throws InterruptedException, IOException
	{
		HandlingFramesUsingJS frames = new HandlingFramesUsingJS();
				
		frames.handlingFrameAndClickChatIconTest();
	}
}
