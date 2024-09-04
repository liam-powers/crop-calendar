package com.cropcalendar;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CropCalendarPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CropCalendarPlugin.class);
		RuneLite.main(args);
	}
}