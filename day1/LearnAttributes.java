package week7.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	//This will execute 2 times and will execute when we run regression test case in xml
	@Test(groups="regression",invocationCount=2)
	public void createLead() {
		System.out.println("create lead");
	}
	//This method depends on previous method and this method will run if regression test case in xml
	@Test(groups="regression",dependsOnMethods="week7.day1.LearnAttributes.createLead")
	public void editLead() {
		System.out.println("----edit lead");
	}
	//This method will execute when we run smoke test case in xml
	@Test(groups="smoke")
	public void deleteLead() {
		System.out.println("delete lead");
	}
	//This method will execute when we run smoke test case in xml
	@Test(groups="smoke")
	public void duplicateLead() {
		System.out.println("duplicate lead");
	}

}
