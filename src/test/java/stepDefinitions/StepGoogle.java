package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.AnnotationsBeforeAfter;

public class StepGoogle {
		
	WebDriver driver= AnnotationsBeforeAfter.driver;

@Given("User is on Google Homepage")
public void user_is_on_google_homepage() 
{	
	driver.get("https://www.google.com");
	System.out.println("Step1");
}

@When("User enter the search string")
public void user_enter_the_search_string() 
{
	String url = driver.getCurrentUrl();
	System.out.println(url);
 
}

@When("Click on search button")
public void click_on_search_button() {
	String title = driver.getTitle();
	System.out.println("Step 2 = " + title);
}

@Then("Results should be displayed")
public void results_should_be_displayed() {
	
	String title = driver.getTitle();
	System.out.println("Step3 = " + title);
}
 
@When("^User enter the \"([^\"]*)\" in search box$")
public void user_enter_the_in_search_box(String arg1) throws Throwable {
	String title = driver.getTitle();
	System.out.println("Step4 = " + title);
	
}
 

}
