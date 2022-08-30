package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://login.salesforce.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter UserName and Password Using Id Locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("ramkumar.ramaiah@testleaf.com");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("Password#123");
		//Click on the login button
		WebElement elementLogin = driver.findElement(By.id("Login"));
		elementLogin.click();
		//Click on the learn more option in the mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//Switch to the next window using windowHandles
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> listOne=new ArrayList<String>(windowHandles);
		System.out.println("Old Window:"+driver.getTitle());
		driver.switchTo().window(listOne.get(1));
		//Click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//Get the title
		System.out.println("New Window:"+driver.getTitle());
		//Get back to the parent window
		driver.switchTo().window(listOne.get(0));
		//Close the browser
		driver.quit();

	}
}
