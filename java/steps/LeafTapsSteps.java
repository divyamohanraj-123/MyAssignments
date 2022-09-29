package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsSteps {
	ChromeDriver driver;
	String leadId;
	@Given("Chrome Browser is opened")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@And("Load the Leaftaps Application URL as {string}")
	public void loadURL(String url) {
		driver.get(url);
	}
	@And("Maximize and set the timeouts")
	public void maxAndTimeOut() {
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("Enter the username as {string}")
	public void enterUserName(String username ) {
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys(username);
	}
	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys(password);
	}
	@When("Click submit button")
	public void clickLoginButton() {
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
	}
	@And("Click on crmsfa link")
	public void clickCrmsfaLink() {
		WebElement elementCRMSFA = driver.findElement(By.id("label"));
		elementCRMSFA.click();
	}
	@Then("Click on Leads tab")
	public void clickLeadButton() {
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
	}
	@When("Click on CreateLead button")
	public void createLeadButton() {
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
	}
	@Then("Enter the Company Name")
	public void companyName() {
		WebElement elementComanyName=  driver.findElement(By.id("createLeadForm_companyName"));
		elementComanyName.sendKeys("IVTL Infoview");
	}
	@And("Enter the First Name")
	public void firstName() {
		WebElement elementFirstName=  driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Divya");
	}
	@And("Enter the Last Name")
	public void lastName() {
		WebElement elementLastName=  driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Mohan");
	}
	@When("Create Lead button is clicked,View Lead is Displayed")
	public void clickCreateLeadButton() {
		WebElement elementSubmit=  driver.findElement(By.name("submitButton"));
		elementSubmit.click();
	}
	@When("Click Find leads")
	public void clickFindLeadsButton() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("Click on phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Then("Enter phone number")
	public void inputPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@And("Click Find Leads Button")
	public void findLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@And("Click on first resulting lead")
	public void firstResultingLead() throws InterruptedException {
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@And("Click Edit")
	public void edit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Change the Company Name")
	public void changeCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@Then("Click Update and Confirm the changed name appears")
	public void udateAndConfirm() {
		driver.findElement(By.name("submitButton")).click();
	}
	@When("Delete button is clicked")
	public void clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Then("Records get deleted")
	public void deleteData() {

		System.out.println("No records to display");

	}
	@When("Duplicate button is clicked")
	public void clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Then("Create a duplicate record")
	public void duplicateRecord() {
		driver.findElement(By.name("submitButton")).click();
	}

	@When("Click Merge leads")
	public void clickMerge() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@Then("From Lead Widget is clicked")
	public void clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@And("Select lead as {string}")
	public void selectLead(String name1) throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}
	@Then("To Lead Widget is clicked")
	public void clickToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

	}
	@And("Enter lead as {string}")
	public void clickLead(String name)
			throws InterruptedException {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}
	@When("Merge button is clicked")
	public void clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
	@Then("Click and verify the merged lead")
	public void verifyMergeLead() throws InterruptedException{
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}


	@And("Close Browser once test case passed")
	public void closeBrowser() {
		driver.close();
	}
}
