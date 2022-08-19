package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the username by using xpath
		WebElement elementUserName = driver.findElement(By.xpath("//p[@class='top']/input"));
		elementUserName.sendKeys("DemoSalesManager");
		//Enter the password by using id xpath
		WebElement elementPassword = driver.findElement(By.xpath("(//input[@class='inputLogin']/following::input)[1]"));
		elementPassword.sendKeys("crmsfa");
		//Click on login button using xpath
		WebElement elementLogin = driver.findElement(By.xpath("(//input[@class='inputLogin']/following::input)[2]"));
		elementLogin.click();
		//Click on CRMSFA link
		WebElement elementCRMSFA = driver.findElement(By.xpath("//div[@id='label']/a"));
		elementCRMSFA.click();
		//Click on Leads button
		WebElement elementLeads = driver.findElement(By.xpath("//div[@class='x-panel-header']/a"));
		elementLeads.click();
		//  Click on Create Lead button
		WebElement elementCreateLead = driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[1]"));
		elementCreateLead.click();
		//Enter the CompanyName by using xpath
		WebElement elementComanyName=  driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[1]"));
		elementComanyName.sendKeys("Infosys");
		//Enter the FirstName by using xpath
		WebElement elementFirstName=  driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[3]"));
		elementFirstName.sendKeys("Divya");
		//Enter the LastName by using xpath
		WebElement elementLastName=  driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[4]"));
		elementLastName.sendKeys("Mohan");
		//Click on Create button by using xpath
		WebElement elementSubmit=  driver.findElement(By.xpath("//input[@name='submitButton']"));
		elementSubmit.click();
		//Click Find leads
		WebElement elementFindLead = driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]"));
		elementFindLead.click();
		//Enter First Name
		WebElement elementFindFirstName = driver.findElement(By.xpath("	(//div[@class='x-tab-panel-body x-tab-panel-body-top']//input)[2]"));
		elementFindFirstName.sendKeys("Divya");
		//Click Find Leads Button
		WebElement elementButtonFindLead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementButtonFindLead.click();
		//Click on first resulting lead
		WebElement elementResultingLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10034']"));
		elementResultingLead.click();
		//Get the title of resulting page
		String title = driver.getTitle();
		System.out.println(title);
		//Click Edit
		WebElement elementEdit = driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[3]"));
		elementEdit.click();
		//Change the Company Name
		WebElement elementNewCompanyName=  driver.findElement(By.id("updateLeadForm_companyName"));
		elementNewCompanyName.clear();
		elementNewCompanyName.sendKeys("TCS");
		//Click Update and Confirm the changed name appears
		WebElement elementUpdate=  driver.findElement(By.xpath("(//input[@name='submitButton'])[1]"));
		elementUpdate.click();
		//Close the browser
        driver.close();

	}

}
