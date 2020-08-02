package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	private WebDriver driver;
	
	LoginPage LPobj;
	HomePage HPobj;
	
	public LoginStepDef() {
		this.driver= Hooks.getDriver();
	}

@Given("^user is on the login page$")
public void user_is_on_the_login_page() {
	
	//driver = BrowserUtility.OpenBrowser(driver);
    System.out.println("login test started");
  
    
}

@When("^title of the page is CogmentoCRM$")
public void title_of_the_page_is_CogmentoCRM() {
	System.out.println("title of page is:  " + driver.getTitle());
}

@Then("^user enters username '(.*?)' and password '(.*?)'$")
// '(.*?)'
public void user_enters_username_er_anandsingh_gmail_com_and_password_Crmtest(String username,String password)  {
	LPobj=new LoginPage(driver);
	LPobj.setUserName(username);
	LPobj.setPassword(password);
	
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button(){

	LPobj.clickSubmit();
	System.out.println("Click login button ");
}

@Then("^user will navigate to home page\\.$")
public void user_will_navigate_to_home_page() {
	System.out.println(" navigate to home page");
	
	HPobj = new HomePage(driver);
	boolean B= HPobj.verifyFreeacctLink();
	System.out.println(" Home page icon displayed " + B);
}


@When("^user clicks on logout link$")
public void user_clicks_on_logout_link() {
	
	LPobj.clickLogout();
    
}

@Then("^user logged out successfully$")
public void user_logged_out_successfully() {
	boolean b = LPobj.verifyLogout();
	System.out.println(" logged out successfully :" + b);
   
}


@Then("^Test \"([^\"]*)\" is passed$")
public void test_is_passed(String arg1) {
	System.out.println(" Test 2 is passed");
}

@Then("^Test \"([^\"]*)\" will also be passed$")
public void test_will_also_be_passed(String arg1)  {
	System.out.println(" Test 3 is passed");
}


}
