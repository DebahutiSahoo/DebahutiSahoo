package com.RMS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityMenu {
	public WebDriver ldriver;
	public SecurityMenu(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	    
	
	    @FindBy(xpath="//span[text()='Security']")
	    WebElement Security_menu_Button;
		@FindBy(xpath="//span[text()=' Roles & Permissions']")
		WebElement Roles_PermissionsButton;
		
		@FindBy(xpath="//span[text()=' Users']")
	    WebElement Users_Menu ;
	
	    @FindBy(xpath="//span[text()=' Shop Employees']")
	    WebElement  ShopEmployees_menu_Button;
		@FindBy(xpath="//span[text()='Certificate/Training']")
		WebElement Certificate_TrainingButton;
	   
		
		public void Security_menu_click()
		{
			Security_menu_Button.click();
		}
		public void RolesPermissionsclick()
		{
			Roles_PermissionsButton.click();
		}
		public void UsersMenu()
		{
			Users_Menu.click();
		}
		
		public void ShopEmployeesmenuClick()
		{
			ShopEmployees_menu_Button.click();
		}
		public void Certificate_Trainingclick()
		{
			Certificate_TrainingButton.click();
		}
}
