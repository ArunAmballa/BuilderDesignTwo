package com.arun.main;

public class DesktopDirector 
{
	
	Desktop buildDesktop(DesktopBuilder builder)
	{
		return builder.buildMotherBoard().buildRam().buildStrorage().build();
		
	}

}
