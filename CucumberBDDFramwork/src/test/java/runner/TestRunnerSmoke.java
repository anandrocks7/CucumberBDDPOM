package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "C:\\Selenium_Project\\CucumberBDDFramwork\\src\\main\\java\\com\\features\\Login.feature",
		features = {"src\\test\\java\\features"},
		glue= {"stepDefinitions"},
		tags = {"@regression"},
		
		//tags = {"@logintest","@smoke","@regression"},
				//dryRun = true,
		//glue={"C:\\Selenium_Project\\CucumberBDDFramwork\\src\\main\\java\\com\\stepdefinitions\\LoginStepDef.java"}
		//the path of the step definition files
		
		//monochrome = true, //display the console output in a proper readable format
		//strict = true, //it will check if any step is not defined in step definition file
		//dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		
		format= {
				"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")
		
 

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @Regr


public class TestRunnerSmoke extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider (parallel = true)
    public Object[][] features() {
        
    	return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}