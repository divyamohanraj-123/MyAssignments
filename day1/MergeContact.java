package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact extends LeafTapBase {
@Test
	public void runMergeContact() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Enter UserName and Password Using Id Locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("DemoSalesManager");
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		//Click on CRM/SFA Link
		WebElement elementCRMSFA = driver.findElement(By.id("label"));
		elementCRMSFA.click();
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']//following::a")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> listOne=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOne.get(1));
		//Click on First Resulting Contact
		driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(listOne.get(0));
		//Click on Widget of To Contact
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']//following::a")).click();
		Set<String> windowHandle=driver.getWindowHandles();
		List<String> listTwo=new ArrayList<String>(windowHandle);
		driver.switchTo().window(listTwo.get(1));
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(listTwo.get(0));
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept the Alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//Verify the title of the page
		String title=driver.getTitle();
		System.out.println(title);
	}

}
