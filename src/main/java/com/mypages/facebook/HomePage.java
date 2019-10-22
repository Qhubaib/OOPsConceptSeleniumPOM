/**
 * 
 */
package com.mypages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Syed Qhubaib Ahmed
 *
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By header = By.xpath("(//span[@class='imgWrap'])[1]//following::div[1]");
	
	public WebElement getHeader()
	{
		return getElement(header);
	}
	
	public String getHomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader()
	{
		return getPageHeader(header);
	}

}
