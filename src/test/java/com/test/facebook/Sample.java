package com.test.facebook;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.properties.facebook.ConfigReader;

public class Sample {
	ConfigReader config;
	
	
	@Test
	public void test()
	{
		config = new ConfigReader();
		System.out.println(config.getApplicationUrl());
	}

}
