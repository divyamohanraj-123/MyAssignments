package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapBase {
	public ChromeDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
