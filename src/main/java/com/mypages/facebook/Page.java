package com.mypages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(this.driver, 20); 
	}
	
	//Abstract Methods
	
	public abstract String getPageHeader(By locator);
	
	public abstract String getPageTitle();
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	
	/*getDeclaredConstructor --> Returns a Constructor object that reflects the specifiedconstructor of 
		the class or interface represented by this Class object
	*/
	public <TPage extends BasePage> TPage getInstance(Class<TPage> TPage)
	{
		try
		{
			return TPage.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
			//Instead of creating Page p = new Page(); --> we are using the the above --> newInstance also serves the same purpose
		}
		catch(Exception e)
		{
			e.getStackTrace();
			return null;
		}
	}

}
