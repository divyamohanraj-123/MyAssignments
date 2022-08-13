package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To add driver to the code
		WebDriverManager.edgedriver().setup();
		//To open a browser
		EdgeDriver driver=new EdgeDriver();
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the browser
		driver.manage().window().maximize();
		//Enter the username by using id locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("DemoSalesManager");
		//Enter the password by using id locator
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		//Click on login button using class locator
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		//Click on CRMSFA link
        WebElement elementCRMSFA = driver.findElement(By.id("label"));
        elementCRMSFA.click();
        //Click on Leads button
        WebElement elementLeads = driver.findElement(By.linkText("Leads"));
        elementLeads.click();
      //Click on Create Lead button
        WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
        elementCreateLead.click();
      //Enter the CompanyName by using id locator
        WebElement elementComanyName=  driver.findElement(By.id("createLeadForm_companyName"));
        elementComanyName.sendKeys("IVTL Infoview");
      //Enter the FirstName by using id locator
      WebElement elementFirstName=  driver.findElement(By.id("createLeadForm_firstName"));
      elementFirstName.sendKeys("Divya");
    //Enter the LastName by using id locator
      WebElement elementLastName=  driver.findElement(By.id("createLeadForm_lastName"));
      elementLastName.sendKeys("Mohan");
    //Enter the FirstNameLocal by using id locator
      WebElement elementFirstNameLocal=  driver.findElement(By.id("createLeadForm_firstNameLocal"));
      elementFirstNameLocal.sendKeys("Pooja");
    //Enter the DepartmentName by using id locator
      WebElement elementDepartment=  driver.findElement(By.id("createLeadForm_departmentName"));
      elementDepartment.sendKeys("CSE");
    //Enter the Description by using id locator
      WebElement elementDescription=  driver.findElement(By.id("createLeadForm_importantNote"));
      elementDescription.sendKeys("Welcome to Selenium platform");
    //Enter the E-mail by using id locator
      WebElement elementEmail=  driver.findElement(By.id("createLeadForm_primaryEmail"));
      elementEmail.sendKeys("divyakumar349@gmail.com");
      //Enter the State by using id locator
      WebElement elementState=  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
      Select selectState=new Select(elementState);
    //Select the State by using selectByVisibleText
      selectState.selectByVisibleText("New York");
    //Click on Create button by using name
      WebElement elementSubmit=  driver.findElement(By.name("submitButton"));
      elementSubmit.click();
    //Get the title of resulting page
      String title = driver.getTitle();
      System.out.println(title);
        
	}

}
