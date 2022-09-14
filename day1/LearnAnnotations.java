package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;

import org.testng.annotations.*;
public class LearnAnnotations  {

	@Test
	public void test1() {
		System.out.println("/t Test 1");
	}
	@Test
	public void test2() {
		System.out.println("/t Test 2");
	}
	@Test
	public void test3() {
		System.out.println("/t Test 3");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");

	}

}
