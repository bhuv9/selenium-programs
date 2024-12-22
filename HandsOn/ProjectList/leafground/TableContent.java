package leafground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableContent {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])//tr"));
		int count = row.size();
		System.out.println("The count of the row is"+count);
		List<WebElement> count1 = driver.findElements(By.xpath("(//table[@role='grid'])//tr//td"));
		int column= count1.size();
		System.out.println("the count of the column is "+column);
		driver.close();
		
		
	
		
		
	}

}