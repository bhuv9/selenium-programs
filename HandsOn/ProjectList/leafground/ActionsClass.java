package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml");
		//driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("form:conpnl_header"));
		System.out.println(source.getLocation());
		Actions  ac = new Actions(driver);
		ac.dragAndDropBy(source, 300, 300).build().perform();
		System.out.println(source.getLocation());
		
		Thread.sleep(5000);
		
		WebElement drag1 = driver.findElement(By.id("form:drag_content"));
		System.out.println(drag1.getLocation());
		
		WebElement drop1 = driver.findElement(By.id("form:drop_content"));
		ac.dragAndDrop(drag1, drop1).build().perform();	
		System.out.println(drop1.getLocation());
		Thread.sleep(5000);
		
		/*WebElement drag2 = driver.findElement(By.id("form:drag_content"));
		
		
		
		WebElement drop2 = driver.findElement(By.id("form:drag_content"));
		ac.dragAndDrop(drag2, drop2).build().perform();*/
		
		
		//Thread.sleep(5000);
		
		
		WebElement drag3 = driver.findElement(By.xpath("(//table[@role='grid'])//tr//th[2]"));
		WebElement drop3 = driver.findElement(By.xpath("(//table[@role='grid'])//tr//th[3]"));
		ac.doubleClick(drag3).dragAndDrop(drag3, drop3).build().perform();
		Thread.sleep(5000);
		
		
		
		WebElement drag4 = driver.findElement(By.xpath("(//table[@role='grid']//tr[1]/td[1])[2]"));
		WebElement drop4 = driver.findElement(By.xpath("(//table[@role='grid']//tr[3]/td[1])[2]"));
		ac.doubleClick(drag4).dragAndDrop(drag4, drop4).build().perform();
		Thread.sleep(5000);
		
		
		WebElement scroll = driver.findElement(By.id("j_idt129"));

		ac.moveToElement(scroll).build().perform();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Thread.sleep(5000);
		
		WebElement slide = driver.findElement(By.id("form:j_idt125"));
		System.out.println(slide.getLocation());
		
		
		ac.doubleClick(slide).perform();
		
		ac.dragAndDropBy(slide, 300, 300).build().perform();
		
		
		
		/*driver.get(By.xpath("form:drag_content"))
		
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))
		
		driver.get(By.xpath(""))*/
		
	}

}
