package com.arun.main;

abstract public class DesktopBuilder
{
	protected Desktop desktop;
	
	abstract DesktopBuilder buildRam();
	
	abstract DesktopBuilder buildMotherBoard();
	
	abstract DesktopBuilder buildStrorage();
	
	Desktop build()
	{
		return desktop;
	}
	
}
