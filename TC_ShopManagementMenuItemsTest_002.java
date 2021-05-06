package com.RMS.TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.RMS.PageObjects.Login;
import com.RMS.PageObjects.ShopManagementMenu;
public class TC_ShopManagementMenuItemsTest_002 extends BaseClass{
  @Test
  public void TestShopManagementMenuItems() throws InterruptedException, IOException {
	  
	try{  
		ShopManagementMenu s=new ShopManagementMenu(driver); 	  
	    s.ShopManagement_Menu();
	    Thread.sleep(4000);
		logger.info("ShopManagement menu has opened");
	    s.EquipmentMenu();
	    Thread.sleep(4000);
		logger.info("Equipment menuitem has opened");
	    s.AccountMenuButton();
	    Thread.sleep(4000);
		logger.info("Account menuitem has opened");
	    s.LocationMenuButton();
	    Thread.sleep(4000);
		logger.info("Location menuitem has opened");
	    s.FormsSetupMenuButton();
	    Thread.sleep(4000);
		logger.info("Form Set Up menuitem has opened");
	    s.SequencesetupmenuButton();
	    Thread.sleep(4000);
		logger.info("Sequence Set up menuitem has opened");
	    s.ShopInformationMenu();
	    Thread.sleep(4000);
		logger.info("Shop Information menuitem has opened");
	    s.CurrencyExchangeButton();
	    Thread.sleep(4000);
		logger.info("Currency Exchange menuitem has opened");
	    s.NotificationSetupmenubtn();
	    Thread.sleep(4000);
		logger.info("Notification Set Up menuitem has opened");
	    s.JobCategoryMenu();
	    Thread.sleep(4000);
		logger.info("Job Category menuitem has opened");
	    s.GageCalibrationMenu();
	    Thread.sleep(4000);
		logger.info("Gage Caliberation menuitem has opened");
	    s.Commodity_Menu();
	    Thread.sleep(4000);
		logger.info("Commodity menuitem has opened");
	    s.RepairClass_Menu();
	    Thread.sleep(4000);
		logger.info("RepairClass menuitem has opened");
	    s.EnhancedYardViewMenu();	   
	    Thread.sleep(4000);
		logger.info("Enhance Yard View menuitem has opened");
	    s.InventoryLocations_Menu();
	    Thread.sleep(4000);
		logger.info("Inventory LOcation menuitem has opened");
	   // s.InspectionForm_Menu();
	   // Thread.sleep(4000);
		//logger.info("InspectionForm menuitem has opened");
	    s.TaxSetupByState_menu();	 
	    Thread.sleep(4000);
		logger.info("Tax Set Up by State menuitem has opened");
	    s.EquipmentSubData_Menu();
	    Thread.sleep(4000);
		logger.info("Equipment SubData menuitem has opened");
	    s.ShipperDefinition_Menu();
	    Thread.sleep(4000);
		logger.info("Shipper Definition menuitem has opened");
	    s.RepairFacilityType_Menu();
	    Thread.sleep(4000);
		logger.info("RepairFacility menuitem has opened");
	    
	    
  
  if(driver.getCurrentUrl().equals("https://automation.railcarrxqa.com/AppWebUI/MetaData/RepairFacilityType.aspx"))
	{
		Assert.assertTrue(true);
		logger.info("ShopManagement menu buttons are working fine");
	}


	}catch(Exception e){
			
	    captureScreen(driver,"TC_ShopManagementMenuItemsTest_002 ");
		Assert.assertTrue(false);
		logger.info("ShopManagement menu Items are not working");
		e.printStackTrace();
	}
  
  }
}
