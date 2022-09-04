package week4.day2;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://www.snapdeal.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to Mens Fashion
		WebElement menFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions fashion = new Actions(driver);
		fashion.moveToElement(menFashion).perform();
		// Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		// Get the count of the sports shoes
		String countShoe = driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText();
		System.out.println("Number of Sport Shoes:" + countShoe);
		// Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		// Get the list of price before Sorting in list
		List<WebElement> sortBefore = driver
				.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		List<Integer> sortBeforeList = new ArrayList<Integer>();
		for (WebElement element: sortBefore) {
			sortBeforeList.add(Integer.valueOf(element.getText().replace("Rs. ", "").replace(",", "")));
		}
		System.out.println("List before sorting:" + sortBeforeList);
		// Sort by Low to High
		driver.findElement(By.xpath("//i[contains(@class,'expand-arrow sort-arrow')]")).click();
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/ul/li[2]")).click();
		Thread.sleep(2000);
		// Get the list of price after sorting
		List<WebElement> sortAfter = driver
				.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		List<Integer> sortAfterList = new ArrayList<Integer>();
		for (WebElement ele1 : sortAfter) {
			sortAfterList.add(Integer.valueOf(ele1.getText().replace("Rs. ", "").replace(",", "")));
		}
		System.out.println("After Sorting:" + sortAfterList);
		// Check if the items displayed are sorted correctly
		Collections.sort(sortBeforeList);
		if (sortBeforeList.equals(sortAfterList)) {
			System.out.println("The Price is sorted Correctly");
		} else
			System.out.println("The Price is not sorted");
		// Select the price range (900-1200)
		Thread.sleep(3000);
		WebElement elementFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
		elementFrom.clear();
		elementFrom.sendKeys("469");
		WebElement elementTo = driver.findElement(By.xpath("//input[@name='toVal']"));
		elementTo.clear();
		elementTo.sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		// Filter with color Navy
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		// verify the all applied filters
		List<WebElement> verifyFilters = driver.findElements(By.xpath("//div[@class='navFiltersPill']/a"));
		String textOne = verifyFilters.get(0).getText();
		String textTwo= verifyFilters.get(1).getText();
		if (textOne.equals("Rs. 469 - Rs. 1200") || textTwo.contains("Navy")) {
			System.out.println("Filters applied");
		} else
			System.out.println("Filters not applied");
		// Mouse Hover on first resulting Training shoes
		Thread.sleep(2000);
		WebElement firstResult = driver
				.findElement(By.xpath("(//div[@class='sort-list hidden']/following-sibling::section/div)[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(firstResult).perform();
		// click QuickView button
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();
		// Print the cost and the discount percentage
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(2000);
		String percent = driver.findElement(By.xpath("//span[@class='payBlkBig']/following-sibling::span")).getText();
		System.out.println("The Price of Shoe:" + price);
		System.out.println("The Discount Percentage:" + percent);
		// Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/Shoe.png");
		//FileUtils.copyFile(source, dest);
		//driver.close();
		
	}

}
