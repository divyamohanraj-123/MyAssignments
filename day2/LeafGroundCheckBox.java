package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://www.leafground.com/checkbox.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To click checkbox,click on the element
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Choose your favourite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		//Tri State Checkbox
		driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']")).click();
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//Verify if checkbox is disabled
		boolean enabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_id102']")).isEnabled();
		if(enabled) {
			System.out.println("Checkbox is enabled");
		}else {
			System.out.println("Checkbox is disabled");
		}
		//Select Multiple
		driver.findElement(By.xpath("//u1[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		}

}
