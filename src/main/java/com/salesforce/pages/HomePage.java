package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	public HomePage verifyTitlePage(String title) {
		title="Home|Salesforce";
		verifyTitle(title);
		return this;
	}
	
	public HomePage clickAll() {
		shadowXpath("//div[text()='All']");
		reportStep("All menu is clicked", "pass");
		return this;
	}
	
	public HomePage clickServiceCatalog() {

		shadowXpath("//span[text()='Service Catalog']");
		reportStep("ServiceCatalog is clicked", "pass");
		return this;
	}
	
	public HomePage clickingMobile() {

		shadowframe("//iframe[@id='gsft_main']");
		clickUsingJs(locateElement(Locators.XPATH, "//h2[contains(text(),'Mobiles')]"));
		reportStep("mobile is clicked", "pass");
		return this;
	}
	public HomePage clickOnAppLauncher() {

		clickUsingJs(locateElement(Locators.XPATH, "//button[@title='App Launcher']/div"));
		reportStep("App Launcher button is clicked", "pass");
		return this;
	}
	public HomePage clickOnViewAll() {

		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("View All button is clicked", "pass");
		return this;
		
	}
	

	
	public HomePage clickOnSales() {

		pause(3000);
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"),"sales");
		click(locateElement(Locators.XPATH, "(//p[@class='slds-truncate']/mark[text()='Sales'])[3]"));
		reportStep("Sales is clicked sucessfully", "pass");
		return this;
		

	}
	
	public LeadsPage clickLeadsTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Leads']"));
		reportStep("Lead tab is clicked successfully", "pass");
		return new LeadsPage();
	}
	
	public AccountPage clickAccountsTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Accounts']"));
		reportStep("Accounts tab is clicked successfully", "pass");
		return new AccountPage();

	}
	

}
