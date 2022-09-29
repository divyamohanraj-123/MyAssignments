package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/java/features/LeaftapsLoginFlow.feature",
"src/test/java/features/LeafTapsEditFlow.feature",
"src/test/java/features/LeafTapsDeleteFlow.feature",
"src/test/java/features/LeafTapsDuplicateFlow.feature",
"src/test/java/features/LeafTapsMergeFlow.feature"},
		glue="steps")
public class RunTest extends AbstractTestNGCucumberTests {

}
