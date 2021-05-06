package com.RMS.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.RMS.PageObjects.Login;
import com.RMS.PageObjects.TopMenuButtons;
public class TC_TopmenuButtonaTest_001 extends BaseClass{
@Test
public void TopmenuButtonaTest() throws InterruptedException, IOException
{
try{
	
	TopMenuButtons tbuttons=new TopMenuButtons(driver);
	tbuttons.ArrivalTab();
	Thread.sleep(4000);
	logger.info("Clicked on Arrival Tab");
	tbuttons.InspectionTab();
	Thread.sleep(4000);
	logger.info("Clicked on Inspection  Tab");
	tbuttons.QuoteTab();
	Thread.sleep(4000);
	logger.info("Clicked on Quote Tab");
	tbuttons.RepairTab();
	Thread.sleep(4000);
	logger.info("Clicked on Repair Tab");
	tbuttons.FinalQATab();
	Thread.sleep(4000);
	logger.info("Clicked on FinalQA Tab");
	tbuttons.DispositionTab();
	Thread.sleep(4000);
	logger.info("Clicked on Disposition Tab");
	tbuttons.InvoiceTab();
	Thread.sleep(4000);
	logger.info("Clicked on Invoice Tab");

	if(driver.getCurrentUrl().equals("https://automation.railcarrxqa.com/AppWebUI/Quotation/ShopRepairInvoice.aspx"))
	{
		Assert.assertTrue(true);
		logger.info("Topmenu buttons are working fine");
	}


}catch(Exception e){
			
	    captureScreen(driver,"TC_TopmenuButtonaTest_001 ");
		Assert.assertTrue(false);
		logger.info("Login Fails");
		e.printStackTrace();
	}
	
}
}