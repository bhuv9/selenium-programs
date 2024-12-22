package leafground;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0s9qng61fxht1vh2fx2h9ww7397125.node0");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		alert.sendKeys("bhuvi");
		alert.accept();
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		alert.accept();
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		String text4 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[1]")).getText();
		System.out.println(text4);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		String text5 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[2]")).getText();
		System.out.println(text5);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		String text6 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[3]")).getText();
		System.out.println(text6);
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		
		
		driver.close();
		

	}

}
