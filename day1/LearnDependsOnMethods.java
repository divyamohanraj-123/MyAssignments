package week7.day1;
import org.testng.annotations.*;
public class LearnDependsOnMethods {
	//This method depends on LearnAttributes.createLead
	@Test(dependsOnMethods="week7.day1.LearnAttributes.createLead")
	public void welcome() {
		System.out.println("welcome----");
	}
	//This will execute 3 times
	@Test(invocationCount=3)
	public void createLead() {
		System.out.println("Creating-----");
	}
	//This method depends on LearnDependsOnMethods.createLead
	@Test(dependsOnMethods="week7.day1.LearnDependsOnMethods.createLead")
	public void editLead() {
		System.out.println("edit lead");
	}
	//To ignore Delete lead from execution
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("-------delete-----");
	}
}
