package com.RMS.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RMS.PageObjects.Login;
import com.RMS.PageObjects.SecurityMenu;
import com.RMS.PageObjects.ShopManagementMenu;
public class TC_SecurityMENUTest_003 extends BaseClass{

	@Test
	public void TestSecurityMenuItems() throws InterruptedException, IOException {
		  
		try{ 
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
		 
			ShopManagementMenu s=new ShopManagementMenu(driver); 	  
		    s.ShopManagement_Menu();
		    Thread.sleep(4000);
			logger.info("ShopManagement menu has opened");
			SecurityMenu securitymenu=new SecurityMenu(driver);
			securitymenu.Security_menu_click();
			Thread.sleep(2000); 
			securitymenu.RolesPermissionsclick();
			Thread.sleep(4000); 
			securitymenu.UsersMenu();	
			Thread.sleep(4000); 
			securitymenu.ShopEmployeesmenuClick();
			Thread.sleep(4000); 
			securitymenu.Certificate_Trainingclick();
			Thread.sleep(4000); 
			if(driver.getCurrentUrl().equals("https://automation.railcarrxqa.com/AppWebUI/MetaData/Training.aspx"))
			{
				Assert.assertTrue(true);
				logger.info("Security menu items  are working fine");
			}


		}catch(Exception e){
					
			    captureScreen(driver,"TC_SecurityMENUTest_003 ");
				Assert.assertTrue(false);
				logger.info("Security menu items  are not working fine");
				e.printStackTrace();
			}
		

	
		}
	}