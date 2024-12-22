package dayOnePrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		String property = System.getProperty("user.dir");
		System.out.println(property);
		System.setProperty("webdriver.chrome.driver", property+"\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	}

}
