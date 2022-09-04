package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CustomerServiceOpption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
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
		Thread.sleep(1000);
		//Get the title
		System.out.println("New Window:"+driver.getTitle());
		//Click on Products and Mousehover on Service 
		Shadow shade=new Shadow(driver);
		WebElement product=shade.findElementByXPath("//span[contains(text(),'Products')]");
		product.click();
		Actions act=new Actions(driver);
		act.moveToElement(product).perform();
		WebElement service=shade.findElementByXPath("//span[text()='Service']/parent::div");
		service.click();
		Actions action=new Actions(driver);
		action.moveToElement(service).build().perform();
		//Click on Customer Services
		WebElement customer=shade.findElementByXPath("//a[text()='Customer Service']");
		customer.click();
		//Get the names Of Services Available 
		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Customer Service']/following-sibling::ul/li"));
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		//Verify the title
		String title=driver.getTitle();
		if(title.contains("Customer Service")) {
			System.out.println("Customer Service page is loaded");
		}else {
			System.out.println("Customer Service page is not loaded");
		}
		//driver.close();
	}

}
