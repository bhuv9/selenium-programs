package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	
	public LeadsPage clickLeadsTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Leads']"));
		reportStep("Lead tab is clicked successfully", "pass");
		return this;
	}
	public LeadsPage clickNewLeadsButton() {
		clickUsingJs(locateElement(Locators.LINK_TEXT, "New"));
		reportStep("create new lead button is clicked successfully", "pass");
		return this;
	}
	public  LeadsPage selectsalutationDropdown() {
         click(locateElement(Locators.XPATH, "//label[text()='Salutation']//following::button[1]"));
         click(locateElement(Locators.XPATH, "//span[text()='Mr.']"));
     	reportStep("Salutation  is selected successfully", "pass");
		return this;       
	} 
	
	////label[text()='First Name']/following::input
	
	public LeadsPage enterFirstName(String firstName) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='First Name']/following::input"), firstName);
		reportStep("First name   is entered successfully", "pass");
		return this; 
		
	}
	
	/*
	 * private By lastName = By.xpath("//label[text()='Last Name']/following::input");
	private By companyName = By.xpath("//label[text()='Company']/following::input");
	 */
	
	public LeadsPage enterLastName(String lastName) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Last Name']/following::input"), lastName);
		reportStep("Last name is entered successfully", "pass");
		return this; 
		
	}
	
	public LeadsPage enterCompanyName(String companyName) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Company']/following::input"), companyName);
		reportStep("Company name is entered successfully", "pass");
		return this; 
	}
	
	public LeadsPage clickSaveLead() {
		pause(3000);
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
    	reportStep("save button is  clicked  successfully", "pass");
		return this;       
	}
	

}
