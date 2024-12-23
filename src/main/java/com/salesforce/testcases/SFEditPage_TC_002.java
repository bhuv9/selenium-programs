package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class SFEditPage_TC_002  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="Salesforce Application";
		testDescription="Login page";
		authors="Bhuvanesh";
		category="Sanity";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uName,String passWord,String aName) {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(passWord)
		.clickOnLogin().clickOnAppLauncher().clickOnViewAll().clickOnSalesIcon().clickAccountsTab().clickNewIcon().EnterAccountName(aName).clickOwnershipDropDown().clickValuesFromOwnershipDropDown().clickSaveButtonInAccountForm().verifyAccountCreated(aName);
	}

}
