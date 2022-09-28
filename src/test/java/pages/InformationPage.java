package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {
	WebDriver driver;
	By btn_info = By.id("com.iplabel.ekaraoncall:id/info");
	By btn_autorise = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.app.Dialog/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");
	// By btn_autorise = By.id("onetrust-accept-btn-handler");
	// String btn_autorise = "Autoriser tous les cookies";
	By img_logo = By.id("Calque_1");
	By btn_menu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button");
	By btn_close = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button");
	// By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button");
	//By txt_besoins = By.xpath("//android.view.View[@content-desc=\"Vosbesoins\"]/android.widget.TextView");
	// By txt_solutions = By.xpath("//android.view.View[@content-desc=\"Nos
	// solutions\"]/android.widget.TextView");
	// By txt_services = By.xpath("//android.view.View[@content-desc=\"Nos
	// services\"]/android.widget.TextView");
	// By txt_Ressources =
	// By.xpath("//android.view.View[@content-desc=\"Ressources\"]/android.widget.TextView");
	// By btn_cookies = By.id("onetrust-pc-btn-handler");

	public InformationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickbtnInfo() {
		driver.findElement(btn_info).click();
	}

	public void clickautorise() {
		driver.findElement(btn_autorise).click();
		// driver.findElement(By.linkText(btn_autorise));

	}

	public void Checkinformationviewdisplayed() {
		driver.findElement(img_logo).isDisplayed();
	}

	public void clickmenu() {
		driver.findElement(btn_menu).click();
	}

	public void closemenu() {
		driver.findElement(btn_close).click();
	}

	public void CheckMenuIsClosed() {
		driver.findElement(btn_menu).isDisplayed();
	}

//	public void CheckVosBesoinsDisplayed() {
//		driver.findElement(txt_besoins).isDisplayed();
//	}
}

//	public void CheckVosNosSolutionsDisplayed() {
//		driver.findElement(txt_solutions).isDisplayed();

//	}

//	public void CheckVosNosServicesDisplayed() {
//		driver.findElement(txt_services).isDisplayed();

//	}

//	public void CheckVosNossocieteDisplayed() {
//		driver.findElement(txt_societe).isDisplayed();

//	}

//	public void CheckVosNosRessourcesDisplayed() {
//		driver.findElement(txt_Ressources).isDisplayed();

//	}

//}
