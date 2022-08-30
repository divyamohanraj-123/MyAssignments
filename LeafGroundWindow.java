package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("https://leafground.com/window.xhtml");
		//To maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> listOne=new ArrayList<String>(windowHandles);
		System.out.println("Old Window:"+driver.getTitle());
		driver.switchTo().window(listOne.get(1));
		System.out.println("New Window:"+driver.getTitle());
		driver.switchTo().window(listOne.get(0));
		//Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']/parent::button")).click();
		Set<String> windowHandle=driver.getWindowHandles();
		List<String> openTabs=new ArrayList<String>(windowHandle);
		System.out.println("Number of Opened Tabs:"+openTabs.size());
		driver.switchTo().window(openTabs.get(0));
		//Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']/parent::button")).click();
		String mainWindow = driver.getWindowHandle();
		for(String otherWindow:driver.getWindowHandles()) {
			if(!otherWindow.equals(mainWindow)) {
				driver.switchTo().window(otherWindow);
				driver.close();
				}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("All windows are closed except primary");
		//Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']/parent::button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> mainWindowHandles = driver.getWindowHandles();
		System.out.println(mainWindowHandles);
		List<String> listOfWindows = new ArrayList<String>(mainWindowHandles);
		System.out.println("Numberof Windows:"+listOfWindows.size());
		driver.switchTo().window(listOfWindows.get(1));
		driver.close();
	}

}
