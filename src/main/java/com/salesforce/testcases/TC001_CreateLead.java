package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_CreateLead  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		testcaseName="Salesforce Application";
		testDescription="Login page";
		authors="Bhuvanesh";
		category="Sanity";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uName,String passWord,String firstName,String lastName,String cName) {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(passWord)
		.clickOnLogin()
		.clickOnAppLauncher()
		.clickOnViewAll()
		.clickOnSales()
		.clickLeadsTab()
		.clickNewLeadsButton()
		.selectsalutationDropdown()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(cName)
		.clickSaveLead();
		

	}

}
