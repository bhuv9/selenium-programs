package dayOnePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		WebElement printText = driver.findElement(By.xpath("//div[text()='Please enter your email address or mobile number to search for your account.']"));
		System.out.println(printText.getText());
		driver.quit();

	}

}