package com.arun.main;

public class Client {
	
	public static void main(String args[])
	{
		DellDesktopBuilder builder=new DellDesktopBuilder();
		
		DesktopDirector director=new DesktopDirector();
		
		Desktop desktop = director.buildDesktop(builder);
		
		desktop.display();
	}

}
