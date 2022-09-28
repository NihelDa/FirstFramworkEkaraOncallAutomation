package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeconnexionPage {
	WebDriver driver;
	By btn_logout = By.id("com.iplabel.ekaraoncall:id/deconnect");
	By btn_signin = By.id("com.iplabel.ekaraoncall:id/buttonSignInekara");
    
	public DeconnexionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Clickbtnlogout() {
		driver.findElement(btn_logout).click();
	}
	public void CheckLoginPageDisplayed() {
		driver.findElement(btn_signin).isDisplayed();

	}
	



}
