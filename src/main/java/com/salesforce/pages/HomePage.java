package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	public HomePage verifyTitlePage(String title) {
		// TODO Auto-generated method stub
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

		click(locateElement(Locators.XPATH, "//button[@title='App Launcher']/div"));
		reportStep("Title page is verified", "pass");

		return this;
	}
	public HomePage clickOnViewAll() {

		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("Title page is verified", "pass");

		return this;
		
	}
	
	public AccountPage clickOnSalesIcon() {

		click(locateElement(Locators.XPATH, "//p[text()='Sales']/ancestor::a"));
		reportStep("Title page is verified", "pass");

		return new AccountPage();

	}
	
	
	

}
