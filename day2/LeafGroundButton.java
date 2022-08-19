package week2.day2;

//import java.awt.List;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://www.leafground.com/button.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click and Confirm title
		System.out.println("Click and Confirm title.");
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::button[1]")).click();
		//Once clicked navigate back
		driver.navigate().back();
		//Confirm if the button is disabled
		System.out.println("Confirm if the button is disabled");
		boolean enabled=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(!enabled) {
			System.out.println("Not enabled");
		}else {
			System.out.println("enabled");
		}
		//Find the position of the Submit button
		System.out.println("Find the position of the Submit button");
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println(location);
		//Find the Save button color
		System.out.println("Find the Save button color");
		//To get color use css value of that element
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println(cssValue);
		//Use getsize method to find the height and width of this button
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size);
		System.out.println("Mouse over and confirm the color changed:");
		WebElement success = driver.findElement(By.xpath("(//span[text()='Success'])[2]"));
		//check the color before
		String color1=success.getCssValue("background-color");
		//use actions class for over
		Actions builder=new Actions(driver);
		builder.moveToElement(success).perform();
		//after mouse over
		String color2=success.getCssValue("background-color");
		if(color1.equals(color2)){
			System.out.println("color changed");
		}else {
			System.out.println("color not changed");

		}
		//Click image button and click on any button
		System.out.println("Click image button and click on any button:");
		//Click on the element
		driver.findElement(By.xpath("(//span[text()='Image'])[1]")).click();
		//Click on hidden elements
		driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
		System.out.println("How many rounded buttons?");
		//Store all the rounded buttons in list and find size
		List<WebElement> roundedButton = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		int size2 = roundedButton.size();
		System.out.println(size2);

	}
}


