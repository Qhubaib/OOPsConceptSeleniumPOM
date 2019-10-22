package com.test.facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.facebook.HomePage;
import com.mypages.facebook.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyfacebookLoginHeader()
	{
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header is: "+header);
		Assert.assertEquals(header, "Facebook");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		HomePage homepage=page.getInstance(LoginPage.class).doLogin(config.getApplicationUserName(),config.getApplicationPassword());
		String header=homepage.getHomePageHeader();
		System.out.println("Homepage header: "+header);
		Assert.assertEquals(header, "Syed Qhubaib Ahmed");
	}

}
