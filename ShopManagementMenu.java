package com.RMS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopManagementMenu {
	public WebDriver ldriver;
	public ShopManagementMenu(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(xpath="//*[@id='AppNAV']/ul/li[2]/a/span")
		WebElement ShopManagement_Menu ;
		
		@FindBy(xpath="//span[text()='Equipment']")
		WebElement Equipment_menu_Button;

		@FindBy(xpath="//span[text()='Accounts']")
		WebElement Account_Menu_Button ;
		
		@FindBy(xpath="//span[text()='Locations']")
		WebElement Location_Menu_Button;

		@FindBy(xpath="//span[text()='Forms Setup']")
		WebElement FormsSetup_Menu_Button ;
		
		@FindBy(xpath="//span[text()='Sequence Setup']")
		WebElement Sequencesetup_menu_Button;
		
		@FindBy(xpath="//span[text()='Shop Information']")
		WebElement ShopInformation_Menu ;
		
		@FindBy(xpath="//span[text()='Currency Exchange']")
		WebElement CurrencyExchange_Button;

		@FindBy(xpath="//span[text()='Notification Setup']")
		WebElement NotificationSetup_menu_btn ;

		@FindBy(xpath="//span[text()='Job Category']")
		WebElement JobCategory_Menu ;

		@FindBy(xpath="//span[text()='Gage Calibration']")
		WebElement GageCalibration_Menu ;

		@FindBy(xpath="//span[text()='Commodity']")
		WebElement Commodity_Menu ;

		@FindBy(xpath="//span[text()='RepairClass']")
		WebElement RepairClass_Menu ;

		@FindBy(xpath="//span[text()='Enhanced Yard View']")
		WebElement EnhancedYardView_Menu ;

		@FindBy(xpath="//span[text()='Inventory Locations']")
		WebElement InventoryLocations_Menu ;

        @FindBy(xpath="//span[text()='Inspection Form']")
		WebElement InspectionForm_Menu ;
		@FindBy(xpath="//span[text()='Tax Setup by State']")
		WebElement TaxSetupByState_menu ;

		@FindBy(xpath="//span[text()='Equipment Sub. Data']")
		WebElement EquipmentSubData_Menu ;

		@FindBy(xpath="//span[text()=' Shipper Definition']")
		WebElement ShipperDefinition_Menu ;
		@FindBy(xpath="//span[text()='Repair Facility Type']")
		WebElement RepairFacilityType_Menu ;

		
		public void ShopManagement_Menu()
		{
			ShopManagement_Menu.click();
		}
		
		public void EquipmentMenu()
		{
			Equipment_menu_Button.click();
		}
		public void AccountMenuButton()
		{
			Account_Menu_Button.click();
		}
		
		public void LocationMenuButton()
		{
			Location_Menu_Button.click();
		}
		public void FormsSetupMenuButton()
		{
			FormsSetup_Menu_Button.click();
		}
		public void SequencesetupmenuButton()
		{
			Sequencesetup_menu_Button.click();
		}
		
		public void ShopInformationMenu()
		{
			ShopInformation_Menu.click();
			}
		public void CurrencyExchangeButton()
		{
			CurrencyExchange_Button.click();
		}
		
		public void NotificationSetupmenubtn()
		{
			NotificationSetup_menu_btn.click();
		}
		public void JobCategoryMenu()
		{
			JobCategory_Menu.click();
		}
		
		public void GageCalibrationMenu()
		{
			GageCalibration_Menu.click();
		}
		public void Commodity_Menu()
		{
			Commodity_Menu.click();
		}
		public void RepairClass_Menu()
		{
			RepairClass_Menu.click();
		}
		
		public void EnhancedYardViewMenu()
		{
			EnhancedYardView_Menu.click();
			}
		public void InventoryLocations_Menu()
		{
			InventoryLocations_Menu.click();
		}
		
		public void InspectionForm_Menu()
		{
			InspectionForm_Menu.click();
		}
		public void TaxSetupByState_menu()
		{
			TaxSetupByState_menu.click();
		}
		public void EquipmentSubData_Menu()
		{
			EquipmentSubData_Menu.click();
		}
		
		public void ShipperDefinition_Menu()
		{
			ShipperDefinition_Menu.click();
			}
		public void RepairFacilityType_Menu()
		{
			RepairFacilityType_Menu.click();
		}
		
		
		
		
		
}
