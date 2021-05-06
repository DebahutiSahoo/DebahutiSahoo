package com.RMS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuButtons {
	public WebDriver ldriver;
	public TopMenuButtons(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(id="step1")
		WebElement Tab_Arrival;
		@FindBy(id="step2")
		WebElement Tab_Inspection;

		@FindBy(id="step3")
		WebElement Tab_Quote;
		@FindBy(id="step4")
		WebElement Tab_Repair;

		@FindBy(id="step5")
		WebElement Tab_FinalQA;
		@FindBy(id="step6")
		WebElement Tab_Disposition;
		@FindBy(id="step7")
		WebElement Tab_Invoice;
		public void ArrivalTab()
		{
			Tab_Arrival.click();
		}
		
		public void InspectionTab()
		{
			Tab_Inspection.click();
		}
		public void QuoteTab()
		{
			Tab_Quote.click();
		}
		public void RepairTab()
		{
			Tab_Repair.click();
		}
		public void FinalQATab()
		{
			Tab_FinalQA.click();
		}
		public void DispositionTab()
		{
			Tab_Disposition.click();
		}
		public void InvoiceTab()
		{
			Tab_Invoice.click();
		}
}
