package com.framework.testng.api.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	public static Properties prop;

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() throws IOException {
		// Step 1: Instance the FileInputStream
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		// Step 2: Create object for Properties
		prop = new Properties();
		// Step 3: Load the property file
		prop.load(fis);
		
		String browserType = prop.getProperty("browser");
		boolean headless = Boolean.parseBoolean(prop.getProperty("headless"));
		String site = prop.getProperty("url");
		startApp(browserType, headless, site);
		setNode();
	}

	@AfterMethod
	public void postCondition() {
		close();

	}

}
