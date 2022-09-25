package week7.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGroups {
	//This method depends on LearnAttributes.createLead
	@Test(dependsOnMethods="week7.day1.LearnAttributes.createLead")
	public void login() {
		System.out.println("------Login");
	}
	//This method will execute when we run smoke test case in xml
	@Test(groups="smoke")
	public void createLead() {
		System.out.println("-----create ---lead");
	}
	@Test(dependsOnGroups={"smoke","functional"})//grouping the string values as array
	public void editLead() {
		System.out.println("edit lead");
	}
	//This test case depends on two groups,so use dependsOnGroups
	@Test(dependsOnGroups={"smoke","functional"})
	public void deleteLead() {
		System.out.println("delete lead");
	}
	//This method will execute when we run functional test case in xml
	@Test(groups="functional")
	public void duplicateLead() {
		System.out.println("duplicate lead");
	}
	@Test(groups="functional")
	public void mergeLead() {
		System.out.println("merge lead");
	}
	//In pre and post conditions,groups cant work so use alwaysRun=true
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		System.out.println("start");
	}
	@AfterMethod(alwaysRun=true)
	public void afterMethod() {
		System.out.println("end");
	}

}
