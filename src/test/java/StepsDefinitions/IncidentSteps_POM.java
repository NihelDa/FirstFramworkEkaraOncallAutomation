package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IncidentPage;

public class IncidentSteps_POM extends BaseClass {

	public IncidentSteps_POM() {

		System.out.println("We will dispaly the incident view on POM");

	};

	@Given("Application was launched")
	public void application_was_launched() {
		System.out.println("Inside Step - Application was launched");
	}

	@When("user click on the Incident button")
	public void user_click_on_the_incident_button() throws InterruptedException {
		System.out.println("Inside Step - user click on the Incident button");
		IncidentPage Incident = new IncidentPage(driver);
		/* click on Incident menu */
		Thread.sleep(4000);
		Incident.ClickViewIncident();
	}

	@Then("the Incident view display")
	public void the_incident_view_display() throws InterruptedException {
		System.out.println("Inside Step - the Incident view display");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.CheckIncidentPageDisplayed();
	}

	@Given("user is on  Incident page")
	public void user_is_on_incident_page() {
		System.out.println("Inside Step - user is on  Incident page");

	}

	@When("user click on workspace dropdown")
	public void user_click_on_the_workspace_dropdown() throws InterruptedException {
		System.out.println("Inside Step - user click on the workspace dropdown");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(4000);
		Incident.ClickDropdown();
	}

	@And("user choice  second workspace")
	public void user_choice_the_second_workspacen() throws InterruptedException {
		System.out.println("Inside Step - user choice the second workspace");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.ClickSecondWorkspace();
	}

	@Then("the scenario Incidents of the second workspace appear")
	public void the_scenario_incidents_of_the_second_workspace_appear() {
		System.out.println("Inside Step - the scenario Incidents of the second workspace appear");

	}

	@Given("Incident view was launched")
	public void incident_view_was_launched() {
		System.out.println("Inside Step - Incident view was launched");
	}

	@When("user click on the button to show closed incident")
	public void user_click_on_the_button_to_show_closed_incident() throws InterruptedException {
		System.out.println("Inside Step - user click on the button to show closed incident");
		IncidentPage Incident = new IncidentPage(driver);
		/* click on show closed Incident */
		Thread.sleep(6000);
		Incident.ClickshowIncident();

	}

	@Then("closed incidents are displayed")
	public void closed_incidents_are_displayed() throws InterruptedException {
		System.out.println("Inside Step - closed incidents are displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Closed incident are displayed */
		Thread.sleep(4000);
		Incident.CheckclosedincidentDisplayed();

	}

	@Given("Closed Incident are displayed")
	public void closed_incident_are_displayed() throws InterruptedException {
		System.out.println("Inside Step - Closed Incident are displayed");

	}

	@When("user click on the incident to display the details")
	public void user_click_on_the_incident_to_display_the_details() throws InterruptedException {
		System.out.println("Inside Step - user click on the incident to display the details");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(6000);
		Incident.ClickIncident();
	}

	@And("Open date of incident is displayed")
	public void open_date_of_incident_is_displayed() throws InterruptedException {
		System.out.println("Inside Step - Open date of incident is displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.CheckOpenDateDisplayed();
	}

	@And("close date of incident is displayed")
	public void close_date_of_incident_is_displayed() throws InterruptedException {
		System.out.println("Inside Step - close date of incident is displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.CheckCloseDateDisplayed();
	}

	@And("duration of incident is displayed")
	public void duration_of_incident_is_displayed() throws InterruptedException {
		System.out.println("Inside Step - duration of incident is displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.CheckDurationValueDisplayed();
	}
	@And("events triggers is displayed")
	public void events_triggers_is_displayed() throws InterruptedException {
		System.out.println("Inside Step - events triggers is displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.CheckEventTriggersDisplayed();
	}
	
	@And("user click on show details of test button")
	public void user_click_on_show_details_of_test_button() throws InterruptedException {
		System.out.println("Inside Step - user click on show details of test button");
		IncidentPage Incident = new IncidentPage(driver);
		/* click on button see details of test */
		Thread.sleep(4000);
		Incident.ClickDtailsIncident();
	}

	@Then("redirection to navigator view of Ekara")
	public void redirection_to_navigator_view_of_ekara() throws InterruptedException {
		System.out.println("Inside Step - redirection to navigator view of Ekara");
		IncidentPage Incident = new IncidentPage(driver);
		/* click on button see details of test */
		Thread.sleep(6000);
		Incident.CheckekaranavigatorDisplayed();	
		/* to press back button of device */
		driver.navigate().back();
		Thread.sleep(3000);
		/* back to first incident view */
		Thread.sleep(3000);
		Incident.ClickbackIncident();

	}

	@Given("Incident was displayed")
	public void incident_was_displayed() {
		System.out.println("Inside Step - Incident was displayed");

	}

	@When("user click on the button to share incident")
	public void user_click_on_the_button_to_share_incident() throws InterruptedException {
		System.out.println("Inside Step - user click on the button to share incident");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(4000);
		Incident.ClickshareIncident();
		/* user click on autorise acess to file */
		Thread.sleep(4000);
		Incident.Clickautorise();
		Thread.sleep(4000);
		Incident.ClickshareIncident();

	}



	@Then("Different methode to share are displayed")
	public void different_methode_to_share_are_displayed() throws InterruptedException {
		System.out.println("Inside Step - Different methode to share are displayed");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(2000);
		Incident.ChecksharemethodDisplayed();
	}

	@Given("Closed incident was displayed")
	public void closed_incident_was_displayed() throws InterruptedException {
		System.out.println("Inside Step - Closed incident was displayed");
		/* to press back button of device */
		driver.navigate().back();

	}

	@When("user click on the button to hide closed incident")
	public void user_click_on_the_button_to_hide_closed_incident() throws InterruptedException {
		System.out.println("Inside Step - user click on the button to hide closed incident");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(10000);
		Incident.ClickhideIncident();
	}

	@Then("closed incident is hided")
	public void closed_incident_is_hided() throws InterruptedException {
		System.out.println("Inside Step - closed incident is hided");
		IncidentPage Incident = new IncidentPage(driver);
		/* Valid that the Incident page is displayed */
		Thread.sleep(4000);
		Incident.CheckIncidentPageDisplayed();
	}

}
