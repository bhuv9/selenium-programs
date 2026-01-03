package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateAccount  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="CreateAccount";
		testcaseName="CreateAccount";
		testDescription="Creating a new Account in the salesforce application";
		authors="Bhuvanesh";
		category="Regression";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateAccount(String userName,String passWord,String accountName) {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(userName)
		.enterPassword(passWord)
		.clickOnLogin()
		.clickOnAppLauncher()
		.clickOnViewAll()
		.clickOnSales()
		.clickAccountsTab()
		.clickNewIcon()
		.EnterAccountName(accountName)
		.clickOwnershipDropDown()
		.clickValuesFromOwnershipDropDown()
		.clickSaveButtonInAccountForm()
		.verifyAccountCreated(accountName)
		.clickAccountsTabNew()
		.EnterAccountNameInSearchField(accountName);
		
	}

}
