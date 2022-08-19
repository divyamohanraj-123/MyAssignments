package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://en-gb.facebook.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create New Button
		WebElement elementCreate=  driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		elementCreate.click();
		//Enter the first name
		WebElement elementFirstName=  driver.findElement(By.xpath(" (//div[@id='fullname_field']//input)[1]"));
		elementFirstName.sendKeys("Divya");
		//Enter the last name
		WebElement elementSurName=  driver.findElement(By.xpath("(//div[@id='fullname_field']//input)[2]"));
		elementSurName.sendKeys("Mohan");
		//Enter the mobile number
		WebElement elementMobile=  driver.findElement(By.xpath("(//div[@id='reg_form_box']//input)[3]"));
		elementMobile.sendKeys("9840371622");
		//Enter the password
		WebElement elementNewPassword=  driver.findElement(By.xpath("(//div[@id='reg_form_box']//input)[5]"));
		elementNewPassword.sendKeys("pooja");
		//Select the Date of Birth
		WebElement elementDay=  driver.findElement(By.xpath("(//div[@id='birthday_wrapper']//select)[1]"));
		elementDay.sendKeys("09");
		Select day=new Select(elementDay);
		day.selectByIndex(10);
		WebElement elementMonth=  driver.findElement(By.xpath("(//div[@id='birthday_wrapper']//select)[2]"));
		elementMonth.sendKeys("Sep");
		Select month=new Select(elementMonth);
		month.selectByVisibleText("Sep");
		WebElement elementYear=  driver.findElement(By.xpath("(//div[@id='birthday_wrapper']//select)[3]"));
		elementYear.sendKeys("1995");
		Select year=new Select(elementYear);
		year.selectByIndex(27);
		//Select the radio button 
		WebElement elementFemale=  driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		elementFemale.sendKeys("Female");
		Select option=new Select(elementFemale);
		option.selectByVisibleText("Female");
		WebElement elementMale=  driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		elementMale.sendKeys();
		WebElement elementCustom=  driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		elementCustom.sendKeys();
	}
	    //form[@id='reg']//label)[1]
}
