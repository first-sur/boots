package com.cucumber.boots.utils;
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
	//	String log4jConfigFile = System.getProperty("user.dir")
	//           + File.separator + "log4j.properties";
	//    PropertyConfigurator.configure(log4jConfigFile);
		Log.info(message);
	}

}