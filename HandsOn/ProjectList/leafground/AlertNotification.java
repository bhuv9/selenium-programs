package leafground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertNotification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01pwlh25sh2qym1pa2mov6g7mey97785.node0");
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
        driver.switchTo().frame(f1);
        WebElement click1 = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
        click1.click();
        
        String text1 = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
        System.out.println(text1);
        driver.switchTo().defaultContent();
        WebElement f3 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
        driver.switchTo().frame(f3);
        WebElement click2 = driver.findElement(By.xpath("//button[text()='Count Frames']"));
        click2.click();
        
        String text2 = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
        System.out.println(text2);
        driver.switchTo().defaultContent();
        
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		
		System.out.println(totalframe.size());
		
		
		
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(f2);
		
		
		WebElement f4 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame(f4);
		WebElement click3 = driver.findElement(By.id("Click"));
		click3.click();
		String text3 = driver.findElement(By.xpath("(//button[text()='Hurray! You Clicked Me.'])")).getText();
		System.out.println(text3);
		
		driver.switchTo().defaultContent();
		
		

	}

}
