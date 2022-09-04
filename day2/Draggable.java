package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			//To open a browser
			ChromeDriver driver=new ChromeDriver();
			//To load an url
			driver.get("https://jqueryui.com/draggable/");
			//To maximize the browser
			driver.manage().window().maximize();
			//Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame(0);
			WebElement element=driver.findElement(By.id("draggable"));
			Actions builder= new Actions(driver);
			builder.dragAndDropBy(element, 100, 100).perform();
			
}
}
