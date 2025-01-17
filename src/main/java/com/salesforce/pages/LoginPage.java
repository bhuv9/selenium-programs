package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	public LoginPage enterUserName(String uName) {
		
		//locate the element
		WebElement locateElement = locateElement("user_name");
		//type userName
		//type(locateElement, uName);
		clearAndType(locateElement, uName);
		//clear & Type - ClearAndType(locateElement, uName);
		reportStep("Enter the UserName as :"+uName, "pass");
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		
		type(locateElement("user_password"), pass);
		reportStep("Enter the PassWord as :"+pass, "pass");
		return this;
	}
	
	

	public HomePage clickOnLogin() {
		click(locateElement("sysverb_login"));
		reportStep("Login is Clicked", "pass");
		return new HomePage();
	}

}
