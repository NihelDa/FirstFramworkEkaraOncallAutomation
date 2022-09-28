package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthentificationPage;

public class AuthentificationSteps_POM extends BaseClass {
	
	public AuthentificationSteps_POM() {
		setup();
		System.out.println("Launch Application");

	};

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_login_and_password(String login, String password) throws InterruptedException {
		System.out.println("Inside Step - user enter login and paswword");

		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);

		/* Saisie login */
		Thread.sleep(2000);
		Authentificate.enterLogin(login);
		/* Saisir Password */
		Thread.sleep(2000);
		Authentificate.enterPassword(password);
	}

	@And("user clicks on eye to show password")
	public void user_clicks_on_eye_to_show_password() {
		System.out.println("Inside Step - user clicks on eye to show password");
		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);
		/* Show password */
		Authentificate.eye();

		// WebElement Eye = driver.findElement(By.id("com.iplabel.ekaraoncall:id/eye"));
		// Eye.click();

	}

	@And("user clicks on remember me")
	public void user_clicks_on_remember_me() {
		System.out.println("Inside Step - user clicks on remember me");
		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);
		/* Clic on Se souvenir de moi */
		Authentificate.rememberme();

		// WebElement SeSouvenir =
		// driver.findElement(By.id("com.iplabel.ekaraoncall:id/checkBoxekara"));
		// SeSouvenir.click();

	}

	@And("user clicks on valide button")
	public void clicks_on_valide_button() {
		System.out.println("Inside Step - user clicks on valide button");
		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);
		/* Clic sur Se connecter */
		Authentificate.Valid();

		// WebElement SeConnecter =
		// driver.findElement(By.id("com.iplabel.ekaraoncall:id/buttonSignInekara"));
		// SeConnecter.click();

	}

	@Then("user is redirected to the home page Console")
	public void user_is_redirected_to_the_home_page_console() throws InterruptedException {
		System.out.println("Inside Step - user is redirected to the home page Console");
		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);
		Thread.sleep(8000);
		Authentificate.CheckLogoutBtnDisplayed();
		// driver.getPageSource().contains("Console");

	}

	@Then("Error message displayed")
	public void Error_message_displayed() throws InterruptedException {
		System.out.println("Inside Step - Error message displayed");
		/* Object */
		AuthentificationPage Authentificate = new AuthentificationPage(driver);
		Thread.sleep(8000);
		System.out.println("Invalid login or password");
		Authentificate.CheckerrormessageDisplayed();
		// driver.getPageSource().contains("Console");

	}
}
