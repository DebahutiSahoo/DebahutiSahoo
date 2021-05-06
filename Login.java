package com.RMS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public WebDriver ldriver;
public Login(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	@FindBy(id="rcrxUserId")
	WebElement txtUsername;
	@FindBy(id="rcrxPassword")
	WebElement txtPassword;
	@FindBy(id="rxrcLoginBtn")
	WebElement loginButton;
	@FindBy(id="logout")
	WebElement logoutButton;
	@FindBy(id="bot2-Msg1")
	WebElement YesButton;
	@FindBy(id="bot1-Msg1")
	WebElement NoButton;
	
	public void Setusername(String User_name)
	{
		txtUsername.sendKeys(User_name);
	}
	public void SetPwd(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void Loginclick()
	{
		loginButton.click();
	}
	
	public void LogoutClick()
	{
		logoutButton.click();
		YesButton.click();
	}
	


}
