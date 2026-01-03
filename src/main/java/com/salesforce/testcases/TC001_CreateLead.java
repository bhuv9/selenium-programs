package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_CreateLead  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		testcaseName="Create Lead ";
		testDescription="Creating a new Lead in the salesforce application";
		authors="Bhuvanesh";
		category="Sanity";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String userName,String passWord,String firstName,String lastName,String companyName) {
		
		LoginPage user=new LoginPage();
		user.enterUserName(userName)
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
		    .enterCompanyName(companyName)
		    .clickSaveLead();
		

	}

}
