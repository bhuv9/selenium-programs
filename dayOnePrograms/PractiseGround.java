package dayOnePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseGround {

	public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
        // Load the URL
        driver.get("https://www.snapdeal.com");

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement inputField = driver.findElement(By.id("inputValEnter"));
        inputField.sendKeys("blue");
        Thread.sleep(5000);
        
        String text = driver.findElement(By.xpath("//input[@id='inputValEnter']/preceding-sibling::div")).getText();
        System.out.println(text);
//        Actions actions = new Actions(driver);
//        actions.click(inputField).perform();
//
//        // Type some text
//        actions.sendKeys("blue").perform();
//
//        // Retrieve the active element and its text
//        WebElement activeElement = driver.switchTo().activeElement();
//        String text = activeElement.getAttribute("value"); // For input fields, use "value" attribute
//        System.out.println("Active Element Text: " + text);
    
}
        
//        
//        WebElement element = driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span"));
//        
//        Actions ac = new Actions(driver);
//        ac.moveToElement(element).build();
//        WebElement element2 = driver.findElement(By.xpath("(//span[text()='Shirts'])[1]"));
//        driver.executeScript("arguments[0].click()", element2);
//        
//        WebElement element3 = driver.findElement(By.xpath("//img[@class='product-image ']"));
//        ac.moveToElement(element3).build();
//        WebElement element4 = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
//        driver.executeScript("arguments[0].click()", element4);

      
      
        

}
