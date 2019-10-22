
package com.mypages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author "Syed Qhubaib Ahmed"
 *
 */
public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Locators
	private By username = By.name("email");
	private By password = By.name("pass");
	private By login = By.xpath("//input[@type='submit'] | //button[@name='login']");
	private By header = By.xpath("//*[text()='Facebook']");
	
	public WebElement getUsername()
	{
		return getElement(username);
	}
	
	public WebElement getPassword()
	{
		return getElement(password);
	}
	
	public WebElement getLoginButton()
	{
		return getElement(login);
	}
	
	public WebElement getHeader()
	{
		return getElement(header);
	}
	
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	
	public String getLoginPageHeader()
	{
		return getPageHeader(header);
	}
	
	/**
	 * doLogin method with both parameters
	 * @param uname
	 * @param pass
	 * @return
	 */
	public HomePage doLogin(String uname,String pass)
	{
		getUsername().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
	/**
	 * No Parameters will be passed
	 * Achieving Method OverLoading Concept
	 */
	public void doLogin()
	{
		getUsername().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}

}
