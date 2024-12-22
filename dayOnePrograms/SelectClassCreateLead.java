package dayOnePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//To load the url
				driver.get("http://leaftaps.com/opentaps");
				// Locate the username field
				//To store as local variable --> ctrl + 2 and release both keys and press L(lowercase)
				WebElement usernameFiled = driver.findElement(By.id("username"));
				//To enter value of the usernameFiled --> WebElement.sendKeys();
				usernameFiled.sendKeys("demosalesmanager");
				
				//Locate the password field and enter the password as crmsfa
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Locate the login button and click on the login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Locate the CRM/SFA link and click
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Locate the Leads tab and click
				driver.findElement(By.linkText("Leads")).click();
				//Locate the Create Lead link and click
				driver.findElement(By.linkText("Create Lead")).click();
				//Locate the companyName field and enter the company name as TestLeaf
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//Locate the first name field and enter the first name as Gokul
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
				//Locate the last name field and enter the last name as Sekar
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				//Locate the source dropdown
				WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//Create object for Select class and pass the WebElement reference inside the Select class constructor
				Select sourceDD = new Select(sourceWE);
				sourceDD.selectByIndex(7);// Select by using index , index starts from zero
				
				//Locate the marketingCampaignId dropdown 
				WebElement campaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select campaignDD = new Select(campaignWE);
				campaignDD.selectByValue("9000");
				
				//Locate the industry dropdown
				WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select industryDD = new Select(industryWE);
				industryDD.selectByVisibleText("Computer Software");
				
				
				//Locate the create lead button and click
				driver.findElement(By.className("smallSubmit")).click();
				String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				System.out.println(leadId);
				//To get the title of the webpage
				String title = driver.getTitle();
				System.out.println(title);
			}

		

	}


