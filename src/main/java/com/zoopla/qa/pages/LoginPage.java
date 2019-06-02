package com.zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	@FindBy(name="signin_email")
	WebElement emailaddress;
	
	@FindBy(name="signin_password")
	WebElement password;
	
	@FindBy(name="action:signin")
	WebElement signInButton;
	
	//initializing the page objects
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	
	public String loginpagetilte()
	{
		return driver.getTitle();
	}
	public HomePage login(String email,String pwd)
	{
		emailaddress.sendKeys(email);
		password.sendKeys(pwd);
		signInButton.click();
		return new HomePage();
	}
	

}
