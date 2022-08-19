package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://www.leafground.com/select.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Choose your favourite Automation tool
		WebElement select=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drop=new Select(select);
		drop.selectByVisibleText("Playwright");
		//Choose your country
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		//Confirm the cities
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		WebElement city1=driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		String text=city1.getText();
		city1.click();
		//Thread.sleep(1000);
		//Change the country and check that city is different or not
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		//Check the city and click
		WebElement city2=driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		city2.getText();
		city2.click();
		//Choose the course
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon-triangle-i-s']")).click();
		//Choose language randomly
		driver.findElement(By.xpath("//lil[text()='AWS']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_3")).click();
	}

}
