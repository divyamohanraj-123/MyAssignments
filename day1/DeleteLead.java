package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends LeafTapBase {
	@Test
	public void runDeleteLead() throws InterruptedException {
		// TODO Auto-generated method stub

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
		elementComanyName.sendKeys("Wipro");
		//Enter the FirstName by using xpath
		WebElement elementFirstName=  driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[3]"));
		elementFirstName.sendKeys("Pooja");
		//Enter the LastName by using xpath
		WebElement elementLastName=  driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[4]"));
		elementLastName.sendKeys("Mohan");
		WebElement elementPhone=  driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']"));
		elementPhone.sendKeys("9487672675");
		//Click on Create button by using xpath
		WebElement elementSubmit=  driver.findElement(By.xpath("//input[@name='submitButton']"));
		elementSubmit.click();
		//Click Find Leads
		WebElement elementFindLead = driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]"));
		elementFindLead.click();
		//Click on Phone
		WebElement elementFindPhone = driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]"));
		elementFindPhone.click();
		//Enter phone number
		WebElement elementTypePhone = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elementTypePhone.sendKeys("9487672675");
		//Click Find Leads button
		WebElement elementFindTypePhone = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindTypePhone.click();
		//Click First resulting lead
		WebElement elementResultingLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10309']"));
		elementResultingLead.click();
		//Click Delete
		WebElement elementDelete = driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[4]"));
		elementDelete.click();
		//Click Find leads
		WebElement elementFindLeads = driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']"));
		elementFindLeads.click();
		WebElement elementFindNameId = driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[1]"));
		elementFindNameId.click();
		//Enter captured lead ID
		WebElement elementSerchLeadID = driver.findElement(By.xpath("//input[@name='id']"));
		elementSerchLeadID.sendKeys("10309");
		//Click find leads button
		WebElement elementSearchLead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementSearchLead.click();
		//Verify message "No records to display" in the Lead list
		WebElement elementNoRecord = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String text=elementNoRecord.getText();
		System.out.println(text);

	}

}
