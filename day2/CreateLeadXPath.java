package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		//To open a browser
		EdgeDriver driver=new EdgeDriver();
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the browser
		driver.manage().window().maximize();
		//Enter the username by using xpath
		WebElement elementUserName = driver.findElement(By.xpath("//input[@id='username']"));
		elementUserName.sendKeys("DemoSalesManager");
		//Enter the password by using id xpath
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");
		//Click on login button using xpath
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();
		//Click on CRMSFA link
		WebElement elementCRMSFA = driver.findElement(By.xpath("//div[@id='label']"));
		elementCRMSFA.click();
		//Click on Leads button
		WebElement elementLeads = driver.findElement(By.xpath("//a [@href='/crmsfa/control/leadsMain']"));
		elementLeads.click();
		//  Click on Create Lead button
		WebElement elementCreateLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']"));
		elementCreateLead.click();
		//Enter the CompanyName by using xpath
		WebElement elementComanyName=  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		elementComanyName.sendKeys("IVTL Infoview");
		//Enter the FirstName by using xpath
		WebElement elementFirstName=  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		elementFirstName.sendKeys("Divya");
		//Enter the LastName by using xpath
		WebElement elementLastName=  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		elementLastName.sendKeys("Mohan");
		//Click on Create button by using xpath
		WebElement elementSubmit=  driver.findElement(By.xpath("//input[@name='submitButton']"));
		elementSubmit.click();


	}

}
