package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://www.nykaa.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Mouseover on Brands and Search L'Oreal Paris
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(brand).perform();
		//Click L'Oreal Paris
		driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
		//Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title=driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println("Contains L'Oreal Paris");
		}else {
			System.out.println("Incorrect page");
		}
		//Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[contains(text(),'Sort By :')]/parent::button")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		// Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//span[text()='Shampoo']/following::div)[1]")).click();
		// Click->Concern->Color Protection
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		// check whether the Filter is applied with Shampoo
		List<WebElement> checkFilter = driver.findElements(By.xpath("//span[@class='filter-value']"));
		String checkShampoo = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		for(WebElement filter:checkFilter)
		{
			String textOne=filter.getText();
			if (textOne.equals(checkShampoo)) {
				System.out.println("Filter is applied for shampoo:" + textOne);
			}
		}
		// Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect')]")).click();
		// GO to the new window and select size as 175ml
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindows.get(1));
		// Print the MRP of the product
		WebElement elementSelect = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select size = new Select(elementSelect);
		size.selectByVisibleText("175ml");
		String findMRP = driver.findElement(By.xpath("(//span[text()='MRP:']/following-sibling::span)[1]")).getText();
		System.out.println("The MRP of the Product :"+findMRP);
		// Click on ADD to BAG
		driver.findElement(By.xpath("(//span[text()='Add to Bag']/parent::button)[1]")).click();
		// Go to Shopping Bag
		driver.findElement(By.xpath("//span[@class='cart-count']/parent::button")).click();
		//Print the Grand Total amount
		WebElement elementFrame=driver.findElement(By.xpath("//iframe[contains(@src,'mobileCartIframe')]"));
		driver.switchTo().frame(elementFrame);
		Thread.sleep(3000);
		String grandTotalBefore=driver.findElement(By.xpath("//div[@class='payment-tbl-data']/div[4]/div[2]")).getText();
		System.out.println("The Grand Total Before : "+grandTotalBefore);
		//Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		// Click on Continue as Guest
		driver.findElement(By.xpath("//div[text()='Checkout as guest']/following-sibling::button")).click();
		//Check if this grand total is the same
		String grandTotalAfter=driver.findElement(By.xpath("(//div[text()='Grand Total']/following::span)[1]")).getText();
		System.out.println("The Grand Total After : "+grandTotalAfter);
		if(grandTotalBefore.contains(grandTotalAfter))
		{
			System.out.println("The Grand Total is same");
		}
		else
			System.out.println("The Grand Total differs");
		//Close all windows
		driver.close();
	}

}
