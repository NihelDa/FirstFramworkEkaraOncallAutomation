/*package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class AuthentificationSteps extends BaseClass {
	

//    public AuthentificationSteps(){
    	
 //   	System.out.println("Launch Application");
    	
 //   };
    

//	@Given("user is on login page")
//	public void open_application_on_device() {
//		setup();
//		System.out.println("Inside Step - user is on login page");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_login_and_password(String login , String password) throws InterruptedException {
//		System.out.println("Inside Step - user enter login and paswword");
//		
//		/* Saisie login */
//		Thread.sleep(2000);
//		WebElement username = driver.findElement(By.id("com.iplabel.ekaraoncall:id/editLoginekara"));
//		username.sendKeys(login);
//		Thread.sleep(2000);
//		/* Saisir Password */
//		WebElement pwd = driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[2]"));
//		pwd.sendKeys(password);
//	}

//	@And("user clicks on eye to show password")
//	public void user_clicks_on_eye_to_show_password() {
//		System.out.println("Inside Step - user clicks on eye to show password");
//		
//		/* Show password */
//		WebElement Eye = driver.findElement(By.id("com.iplabel.ekaraoncall:id/eye"));
//		Eye.click();
//	}

//	@And("user clicks on remember me")
//	public void user_clicks_on_remember_me() {
//		System.out.println("Inside Step - user clicks on remember me");
		
//		/* Clic on Se souvenir de moi */
//		WebElement SeSouvenir = driver.findElement(By.id("com.iplabel.ekaraoncall:id/checkBoxekara"));
//		SeSouvenir.click();

//	}

//	@And("user clicks on valide button")
//	public void clicks_on_valide_button() {
//		System.out.println("Inside Step - user clicks on valide button");

//		/* Clic sur Se connecter */
//		WebElement SeConnecter = driver.findElement(By.id("com.iplabel.ekaraoncall:id/buttonSignInekara"));
//		SeConnecter.click();
//		System.out.println("clicks on valide button");

//	}

//	@Then("user is redirected to the home page Console")
//	public void user_is_redirected_to_the_home_page_console() {
//		System.out.println("Inside Step - user is redirected to the home page Console");
//		driver.getPageSource().contains("Console");
//	}

//}

