package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertification {

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
		//Get the title
		System.out.println("New Window:"+driver.getTitle());
		//Click Resources and mouse hover on Learning On Trailhead
		Shadow shade=new Shadow(driver);
		shade.findElementByXPath("//span[contains(text(),'Learning')]").click();
		shade.findElementByXPath("//span[contains(text(),'Learning on Trailhead')]").click();
		//Click on Salesforce Certifications and Navigate to Certification - Administrator Overview window
		Thread.sleep(1000);
		WebElement certificate=shade.findElementByXPath("//a[text()='Salesforce Certification']");
		Actions builder=new Actions(driver);
		builder.scrollToElement(certificate).perform();
		builder.click(certificate).perform();
		//Verify the Certifications available for Administrator Certifications should be displayed
		driver.findElement(By.xpath("(//div[@class='credentials-card_title']/preceding::a)[12]")).click();
		String title=driver.getTitle();
		if(title.contains("Administrator")) {
			System.out.println("Administrator Certifications are displayed");
		}else {
			System.out.println("Administrator Certifications are not displayed");
		}
		driver.close();

	}

}
