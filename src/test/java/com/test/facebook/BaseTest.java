package com.test.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import com.mypages.facebook.BasePage;
import com.mypages.facebook.Page;
import com.properties.facebook.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public Page page;
	ConfigReader config;
	
	//@Parameters({"browser"})
	@BeforeTest
	public void setUp()
	{
		String browser="chrome";
		System.out.println("Launching Browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("no browser is defined in xml file..");
		}
		config = new ConfigReader();
		driver.get(config.getApplicationUrl());
		
		page = new BasePage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
