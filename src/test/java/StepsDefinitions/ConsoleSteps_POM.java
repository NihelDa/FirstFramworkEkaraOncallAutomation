package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsolePage;

public class ConsoleSteps_POM extends BaseClass{

    public ConsoleSteps_POM(){
    	
    	System.out.println("Console vue displayed on POM");
    	
    };
    

	@Given("user is on  Console page")
	public void user_is_on_Console_page() {
		System.out.println("Inside Step - user is on  Console page");
	}

	@When("user click on the workspace dropdown")
	public void use_click_on_the_workspace_dropdown() throws InterruptedException {
		System.out.println("Inside Step - user click on the workspace dropdown");
		/*Object*/
		ConsolePage Console = new ConsolePage(driver);
		/* click on dropdown */
		Thread.sleep(6000);
		Console.ClickDropdown();

	}

	
	@And("user choice the second workspace")
	public void user_choice_the_second_workspace() throws InterruptedException {
		System.out.println("Inside Step - user choice the second workspace");	
		/*Object*/
		ConsolePage Console = new ConsolePage(driver);
		Thread.sleep(4000);
		/* click on second workspace */
		Console.ClickSecondWorkspace();
	}



	@Then("the scenario consoles of the second workspace appear")
	public void the_scenario_consoles_of_the_second_workspace_appear() throws InterruptedException {
		System.out.println("Inside Step - the scenario consoles of the second workspace appear");
		/*Object*/
		ConsolePage Console = new ConsolePage(driver);
		/* Valid the display of second workspace */
		Console.CheckSecondWorkspaceDisplayed();;
	}
	
	@And("user choice the third workspace")
	public void user_choice_the_third_workspace() throws InterruptedException {
		System.out.println("Inside Step - user choice the third workspace");	
		/*Object*/
		ConsolePage Console = new ConsolePage(driver);
		Thread.sleep(4000);
		/* click on second workspace */
		Console.ClickThirdWorkspace();
	}



	@Then("the scenario consoles of the third workspace appear")
	public void the_scenario_consoles_of_the_third_workspace_appear() throws InterruptedException {
		System.out.println("Inside Step - the scenario consoles of the third workspace appear");
		/*Object*/
		ConsolePage Console = new ConsolePage(driver);
		/* Valid the display of second workspace */
		Console.CheckThirdWorkspaceDisplayed();
	}



}
