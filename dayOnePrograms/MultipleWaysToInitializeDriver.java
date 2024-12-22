package dayOnePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWaysToInitializeDriver {

	
		// TODO Auto-generated method stub
		
		// using remote webdriver for running the test in remote or cloud server
	
	
	public static void main(String[] args) {
		
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\EclipseNew\\WeekNumTwo\\driver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open a URL
        driver.get("http://www.google.com");

        // Perform any actions on the page

        // Close the browser
        driver.quit();

	
		
	
	
	}
}
