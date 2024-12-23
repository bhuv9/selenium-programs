package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountPage extends ProjectSpecificMethods {
	
	public AccountPage clickAccountsTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Accounts']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	public AccountPage clickNewIcon() {
		click(locateElement(Locators.XPATH, "//a[@title='New']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	public AccountPage EnterAccountName(String accountName) {

		clearAndType(locateElement(Locators.XPATH, "//label[text()='Account Name']/following::input"), accountName);
		reportStep("Title page is verified", "pass");
		return this;

	}
	public AccountPage clickOwnershipDropDown() {
		clickUsingJs(locateElement(Locators.XPATH, "//button[@aria-label='Ownership']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	public AccountPage clickValuesFromOwnershipDropDown() {
		click(locateElement(Locators.XPATH, "//span[text()='Public']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	public AccountPage clickSaveButtonInAccountForm() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	public AccountPage verifyAccountCreated(String accountName) {

				boolean verifyPartialText = verifyPartialText(locateElement(Locators.XPATH, "//span[@class='toastMessage slds-text-heading--small forceActionsText']"), accountName );
				System.out.println("Account Name is verified :  "+verifyPartialText);

				return this;
	}
	
	public AccountPage EnterAccountNameInSearchField(String accountName) {

		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), accountName);
		reportStep("Title page is verified", "pass");
		return this;

	}
	public AccountPage clickAccountDropDown() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[@class='slds-icon_container slds-icon-utility-down'])[1]"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	
	public AccountPage clickDeleteOption() {
		click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		reportStep("Title page is verified", "pass");
		return this;
	}
	
	
	
	

	
	
	
	
	
	
	
	

}
