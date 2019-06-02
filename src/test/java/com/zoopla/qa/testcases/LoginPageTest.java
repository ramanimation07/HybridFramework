package com.zoopla.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.HomePage;
import com.zoopla.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
	}
	@Test(priority = 1)
	
	public void titleTest()
	{
		String title=loginpage.loginpagetilte();
		Assert.assertEquals(title,"Register or sign in to Zoopla - Zoopla");
	}
	
	@Test(priority = 2)
	
	public void loginTest()
	{
		homepage=loginpage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}
	

}
