package runner;

import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps"
        
        )
public class RunCuke extends AbstractTestNGCucumberTests {
	
	@BeforeClass
    public static void setup() {
	
	}
	
	

}
