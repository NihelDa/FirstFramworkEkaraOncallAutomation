package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InformationPage;

public class InformationSteps_POM extends BaseClass {

	public InformationSteps_POM() {

		System.out.println("Test the Information view on POM");

	};

	@Given("Application launched")
	public void Application_launched() {
		System.out.println("Inside Step - Application launched");
	}

	@When("user click on the Information button")
	public void user_click_on_the_Information_button() throws InterruptedException {
		System.out.println("Inside Step - user click on the Information button");
		InformationPage Info = new InformationPage(driver);
		/* click on Information button */
		Thread.sleep(3000);
		Info.ClickbtnInfo();
	}

	@And("Click on autorise cookies")
	public void Click_on_autorise_cookies() throws InterruptedException {
		System.out.println("Inside Step - Click on autorise cookies ");
		InformationPage Info = new InformationPage(driver);
		/* click on autorise button */
		Thread.sleep(5000);
		Info.clickautorise();
	}

	@And("Open menu")
	public void Open_menu() throws InterruptedException {
		System.out.println("Inside Step - Open menu ");
		InformationPage Info = new InformationPage(driver);
		/* click on Information button */
		Thread.sleep(4000);
		Info.clickmenu();
	}

	@And("Close menu")
	public void Close_menu() {
		System.out.println("Inside Step - Close menu ");
		InformationPage Info = new InformationPage(driver);
		/* click on Information button */
		Info.closemenu();
	}

	@Then("check menu is closed")
	public void check_the_menu_Ressources() {
		System.out.println("Inside Step - check the logo Ekara ");
		InformationPage Info = new InformationPage(driver);
		/* check the menu is closed */
		Info.CheckMenuIsClosed();
	}
}

/*
 * @And("user autorise cookies") public void user_autorise_cookies() throws
 * InterruptedException {
 * System.out.println("Inside Step - user autorise cookies"); InformationPage
 * Info = new InformationPage(driver); /* click on autorise cookies
 */
/*
 * Thread.sleep(2000); Info.clickautorise(); }
 */
/* 	@And("check the menu Vos besoins")
	public void check_the_menu_Vos_besoins() throws InterruptedException {
		System.out.println("Inside Step - check the menu Vos besoins");
		InformationPage Info = new InformationPage(driver);
		/* check the menu Vos besoins */
/*		Thread.sleep(4000);
		Info.CheckVosBesoinsDisplayed();
	}
 * @And("click on menu") public void click_on_menu() throws InterruptedException
 * { System.out.println("Inside Step - click on menu "); InformationPage Info =
 * new InformationPage(driver); /* click on menu
 */
/*
 * Thread.sleep(2000); Info.clickmenu(); }
 * 
 * 
 * 
 * 
 * 
 * @And("check the menu Nos solutions") public void
 * check_the_menu_Nos_solutions() throws InterruptedException {
 * System.out.println("Inside Step - check the menu Nos solutions");
 * InformationPage Info = new InformationPage(driver); /* check the menu Nos
 * solutions
 */
/*
 * Thread.sleep(1000); Info.CheckVosNosSolutionsDisplayed(); }
 * 
 * 
 * @And("check the menu Vos services") public void check_the_menu_Vos_services()
 * throws InterruptedException {
 * System.out.println("Inside Step - check the menu Vos services");
 * InformationPage Info = new InformationPage(driver); /* check the menu Vos
 * services
 */
/*
 * Thread.sleep(1000); Info.CheckVosNosServicesDisplayed(); }
 * 
 * @And("check the menu Notre societe") public void
 * check_the_menu_Notre_societe() throws InterruptedException {
 * System.out.println("Inside Step - check the menu Notre societe");
 * InformationPage Info = new InformationPage(driver); /* check the menu Notre
 * societe
 */
/*
 * Thread.sleep(1000); Info.CheckVosNossocieteDisplayed(); }
 * 
 * @Then("check the menu  Ressources ") public void check_the_menu_Ressources ()
 * throws InterruptedException {
 * System.out.println("Inside Step - check the menu  Ressources ");
 * InformationPage Info = new InformationPage(driver); /* check the menu
 * Ressources
 */
/*
 * Thread.sleep(1000); Info.CheckVosNosRessourcesDisplayed(); }
 * 
 * 
 * 
 * }
 */