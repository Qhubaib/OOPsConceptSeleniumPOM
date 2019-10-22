package com.properties.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	public ConfigReader()
	{
		try
		{
			File path = new File("G:\\SQ AHMED\\Eclipse_WorkSpace\\OOPsConceptProjrct\\src\\main\\java\\com\\properties\\facebook\\config.properties");
			FileInputStream file = new FileInputStream(path);
			prop = new Properties();
			prop.load(file);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

	public String getApplicationUrl()
	{
		return prop.getProperty("url");
	}
	
	public String getApplicationUserName()
	{
		return prop.getProperty("username");
	}
	
	public String getApplicationPassword()
	{
		return prop.getProperty("password");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		ConfigReader config = new ConfigReader();
		System.out.println(config.getApplicationUrl());
	}
}
