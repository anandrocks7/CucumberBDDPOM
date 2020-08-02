package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestScenariosAStepDef {

	private WebDriver driver;

	public TestScenariosAStepDef() {
		this.driver= Hooks.getDriver();
	}
	
	
	
	@Given("^scenario one$")
	public void scenario_one() {
		 System.out.println("scenario one");
	}

	@Then("^verify scenario one$")
	public void verify_scenario_one() throws Throwable {
		System.out.println(" verify scenario one ");
	}

	@Given("^scenario two$")
	public void scenario_two()  {
		 System.out.println("scenario two");
	}

	@Then("^verify scenario two$")
	public void verify_scenario_two()  {
		System.out.println(" verify scenario two ");
	}

	@Given("^scenario three$")
	public void scenario_three()  {
		 System.out.println("scenario three");
	}

	@Then("^verify scenario three$")
	public void verify_scenario_three() {
		System.out.println(" verify scenario three ");
	}

	@Given("^scenario four$")
	public void scenario_four()  {
	   System.out.println("scenario four");
	}

	@Then("^verify scenario four$")
	public void verify_scenario_four(){
		  System.out.println(" verify scenario four");
	}


}
