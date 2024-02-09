package com.arun.main;

public class DellDesktopBuilder extends DesktopBuilder{

	DellDesktopBuilder()
	{
		desktop=new Desktop();
	}
	
	@Override
	DesktopBuilder buildRam() {
		
		desktop.desktopRam="128 GB";
		return this;
		
	}

	@Override
	DesktopBuilder buildMotherBoard() {
		desktop.motherBoard="Dell MotherBaord";
		return this;
	}

	@Override
	DesktopBuilder buildStrorage() {
		desktop.storage="200 GB";
		return this;
	}

}
