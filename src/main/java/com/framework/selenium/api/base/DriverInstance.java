package com.framework.selenium.api.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.testng.AbstractTestNGCucumberTests;



public class DriverInstance  extends AbstractTestNGCucumberTests{
   // Inheritance,encapsulation ---> // Singleton design pattern
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {

	    switch (browser.toLowerCase()) {

	        case "chrome":
	            remoteWebdriver.set(new ChromeDriver(getChromeOptions(headless)));
	            break;

	        case "firefox":
	            FirefoxOptions firefoxOptions = new FirefoxOptions();

	            if (headless) {
	                firefoxOptions.addArguments("--headless");
	            }

	            remoteWebdriver.set(new FirefoxDriver(firefoxOptions));
	            break;

	        case "edge":
	            EdgeOptions edgeOptions = new EdgeOptions();

	            if (headless) {
	                edgeOptions.addArguments("--headless=new");
	                edgeOptions.addArguments("--window-size=1920,1080");
	            }

	            remoteWebdriver.set(new EdgeDriver(edgeOptions));
	            break;

	        default:
	            System.out.println("Invalid browser. Launching Chrome by default.");
	            remoteWebdriver.set(new ChromeDriver(getChromeOptions(headless)));
	    }
	}

	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
	private ChromeOptions getChromeOptions(boolean headless) {

	    ChromeOptions options = new ChromeOptions();

	    options.addArguments("--start-maximized");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--disable-infobars");
	    options.addArguments("--disable-extensions");
	    options.addArguments("--remote-allow-origins=*");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--no-sandbox");
	    options.addArguments("--user-data-dir=C:\\Users\\DELL\\SleniuProfile");
	    options.addArguments("--profile-directory=Default");

	    if (headless) {
	        options.addArguments("--headless=new");
	        options.addArguments("--window-size=1920,1080");
	    }

	    return options;
	}

	
}
