package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeconnexionPage;

public class DeconnexionSteps_POM extends BaseClass {
	
    public DeconnexionSteps_POM(){
    	
    	System.out.println("We will deconnect from the application on POM");
    	
    };
    
    @Given("Application is connected")
    public void application_is_connected() {
    	System.out.println("Inside Step - Application is connected");
    }

    @When("user click on the logout button")
    public void user_click_on_the_logout_button() throws InterruptedException {
		System.out.println("Inside Step - user click on the logout button");
		DeconnexionPage LogOut = new DeconnexionPage(driver);
		/* click on logout button*/
		Thread.sleep(4000);
		LogOut.Clickbtnlogout();
    }

    @Then("Application is Deconnected")
    public void Deconnected_Application() throws InterruptedException  {
		System.out.println("Inside Step - Deconnected Application");
		DeconnexionPage LogOut = new DeconnexionPage(driver);
		/* Valid that the Login page is displayed*/
		Thread.sleep(4000);
		LogOut.CheckLoginPageDisplayed();
    }

}
