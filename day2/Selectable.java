package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				//To open a browser
				ChromeDriver driver=new ChromeDriver();
				//To load an url
				driver.get("https://jqueryui.com/selectable/");
				//To maximize the browser
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.switchTo().frame(0);
				WebElement item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement item3=driver.findElement(By.xpath("//li[text()='Item 3']"));
				WebElement item5=driver.findElement(By.xpath("//li[text()='Item 5']"));
				WebElement item7=driver.findElement(By.xpath("//li[text()='Item 7']"));
				Actions builder= new Actions(driver);
				builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
				
	}

}
