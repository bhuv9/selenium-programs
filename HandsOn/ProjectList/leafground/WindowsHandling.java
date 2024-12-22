package leafground;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.Json;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/window.xhtml");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> win1 = driver.getWindowHandles();
		List<String> lastwin = new ArrayList<String>(win1);
		driver.switchTo().window(lastwin.get(1));
		
		System.out.println("window no 1   ="+driver.getTitle());
		driver.close();
		
		Thread.sleep(5000);
		
		
		driver.switchTo().window(lastwin.get(0));
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> win2 = driver.getWindowHandles();
		System.out.println(win2.size());
		List<String>listwin = new ArrayList<String>(win2);
		driver.switchTo().window(listwin.get(1));
		System.out.println("window no 2    ="+driver.getTitle());
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(listwin.get(0));
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> win3 = driver.getWindowHandles();
		List<String>lstwin = new ArrayList<String>(win3);
		driver.switchTo().window(lstwin.get(1));
		System.out.println("window no 3   ="+driver.getTitle());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(0,-2000)");
		
		
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(lstwin.get(0));
		System.out.println(driver.getTitle());
		
		
		WebElement waitwindow = driver.findElement(By.xpath("//span[text()='Open with delay']"));
		waitwindow.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*WebDriverWait wait = new  WebDriverWait(driver, null);
		
		wait.until(ExpectedConditions.visibilityOf(waitwindow));*/
		
		System.out.println("title of the last window    = "+driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
