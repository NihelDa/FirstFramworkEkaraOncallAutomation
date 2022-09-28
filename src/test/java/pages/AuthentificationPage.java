package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthentificationPage {

	WebDriver driver;
	By txt_login = By.id("com.iplabel.ekaraoncall:id/editLoginekara");
	By txt_password = By.id("com.iplabel.ekaraoncall:id/editPasswordekara");
	By checkbox_remember = By.id("com.iplabel.ekaraoncall:id/checkBoxekara");
	By btn_eye = By.id("com.iplabel.ekaraoncall:id/eye");
	By btn_signin = By.id("com.iplabel.ekaraoncall:id/buttonSignInekara");
	By btn_logout = By.id("com.iplabel.ekaraoncall:id/deconnect");
	By txt_error = By.id("com.iplabel.ekaraoncall:id/textFollow");

	public AuthentificationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterLogin(String username) {
		driver.findElement(txt_login).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void rememberme() {

		boolean flag = driver.findElement(checkbox_remember).isDisplayed();
		System.out.println(flag);
		if (flag) // true
		{
			System.out.println("select checkbox Remember me");
			driver.findElement(checkbox_remember).click();

		} else // false
		{
			System.out.println("checkbox is already selected");
		}

	}

	public void eye() {
		driver.findElement(btn_eye).click();

	}

	public void Valid() {
		driver.findElement(btn_signin).click();

	}

	public void CheckLogoutBtnDisplayed() {
		driver.findElement(btn_logout).isDisplayed();

	}

	public void CheckerrormessageDisplayed() {
		driver.findElement(txt_error).isDisplayed();

	}

}
