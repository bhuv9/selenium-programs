package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountPage extends ProjectSpecificMethods {

	public AccountPage clickNewIcon() {
		click(locateElement(Locators.XPATH, "//a[@title='New']"));
		reportStep("New Icon is clicked successfully", "pass");
		return this;
	}

	public AccountPage EnterAccountName(String accountName) {

		clearAndType(locateElement(Locators.XPATH, "//label[text()='Account Name']/following::input"), accountName);
		reportStep("AccountName is entered successfully", "pass");
		return this;

	}

	public AccountPage clickOwnershipDropDown() {
		clickUsingJs(locateElement(Locators.XPATH, "//button[@aria-label='Ownership']"));
		reportStep("Ownership DropDown is clicked successfully", "pass");
		return this;
	}

	public AccountPage clickValuesFromOwnershipDropDown() {
		click(locateElement(Locators.XPATH, "//span[text()='Public']"));
		reportStep("Values From Ownership DropDown is clicked successfully", "pass");
		return this;
	}

	public AccountPage clickSaveButtonInAccountForm() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("Save Button is clicked successfully", "pass");
		return this;
	}

	public AccountPage verifyAccountCreated(String accountName) {

		boolean verifyPartialText = verifyPartialText(locateElement(Locators.XPATH,
				"//span[@class='toastMessage slds-text-heading--small forceActionsText']"), accountName);
		System.out.println("Account Name is verified :  " + verifyPartialText);
		return this;
	}

	public AccountPage EnterAccountNameInSearchField(String accountName) {

		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), accountName);
		reportStep("Account Name In Search Field is entered successfully", "pass");
		return this;

	}

	public AccountPage clickAccountDropDown() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[@class='slds-icon_container slds-icon-utility-down'])[1]"));
		reportStep("Account DropDown is clicked successfully", "pass");
		return this;
	}

	public AccountPage clickDeleteOption() {
		click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		reportStep("Delete Option is clicked successfully", "pass");
		return this;
	}

	public AccountPage clickAccountsTabNew() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Accounts']"));
		reportStep("Accounts New Tab is clicked successfully", "pass");
		return this;
	}

}
