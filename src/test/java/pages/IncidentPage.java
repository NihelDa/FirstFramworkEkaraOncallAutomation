package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IncidentPage {

	WebDriver driver;
	By menu_incident = By.id("com.iplabel.ekaraoncall:id/incidents");
	// By menu_incident = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageButton[2]");
	String Nameview = "Incidents";
	//By show_incident = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	By show_incident = By.id("com.iplabel.ekaraoncall:id/buttonShowAlertEkara");
	By List_closed_incident = By.id("com.iplabel.ekaraoncall:id/recyclerAfficherekara");

	String NameScenario2 = "Scenario2"; 
	By btn_share = By.id("com.iplabel.ekaraoncall:id/shareLayout");
	//By btn_share = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup");
	By btn_autorise = By.id("com.android.permissioncontroller:id/permission_allow_button");
	
	//By btn_autorise = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\"");
	By share_as_link = By.id("android:id/sem_chooser_chip_button1");

	//String first_incident = "Scenario_2";
	By first_incident = By.id("com.iplabel.ekaraoncall:id/card_linear");
	String open_date = "OUVERT";
	String close_date = "FERM�";
	String duration_value = "DUR�E";
	String events_triggers = "EV�NEMENTS D�CLENCHEURS";
	By back_incident = By.id("com.iplabel.ekaraoncall:id/toolbar_back");

	By see_details_incident = By.id("com.iplabel.ekaraoncall:id/buttonShowAlert");
	By Ekara_web = By.id("com.android.chrome:id/url_bar");
	String EkaraLink = "ekara.ip-label.net";

	By hide_incident = By.id("com.iplabel.ekaraoncall:id/buttonShowAlertEkara");

	By list_dropdown = By.id("com.iplabel.ekaraoncall:id/spinner04");
	By list_secondworkspace = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
	By Icone_app = By.xpath("//android.widget.TextView[@content-desc=\"Ekara On Call\"]");

	public IncidentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickViewIncident() {
		driver.findElement(menu_incident).click();
	}

	public void CheckIncidentPageDisplayed() {
		driver.getPageSource().contains(Nameview);

	}

	public void ClickshowIncident() {
		driver.findElement(show_incident).click();
	}

	public void CheckclosedincidentDisplayed() {
		driver.findElement(List_closed_incident).isDisplayed();

	}

	public void ClickshareIncident() {
		driver.findElement(btn_share).click();
	}

	public void Clickautorise() {
		driver.findElement(btn_autorise).click();
	}

	public void ChecksharemethodDisplayed() {
		driver.findElement(share_as_link).isDisplayed();

	}

	public void ClickIncident() {
		//WebElement target = driver.findElement(first_incident);
		driver.getPageSource().contains(NameScenario2);
		driver.findElement(first_incident).click();
       // Actions builder = new Actions(driver);            
        //builder.moveToElement(target , 500  , 1300).click().build().perform();

	}

	public void CheckOpenDateDisplayed() {
		driver.getPageSource().contains(open_date);
	}

	public void CheckCloseDateDisplayed() {
		driver.getPageSource().contains(close_date);

	}

	public void CheckDurationValueDisplayed() {
		driver.getPageSource().contains(duration_value);
	}
    
	public void CheckEventTriggersDisplayed() {
		driver.getPageSource().contains(events_triggers);
	}
	
	public void ClickDtailsIncident() {
		driver.findElement(see_details_incident).click();
	}

	public void CheckekaranavigatorDisplayed() {
		driver.findElement(Ekara_web).isDisplayed();
		driver.getPageSource().contains(EkaraLink);

	}

	public void ClickbackIncident() {
		driver.findElement(back_incident).click();
	}

	public void ClickhideIncident() {
		driver.findElement(hide_incident).click();
	}

	public void Checkclosedincidenthided() {
		driver.getPageSource().contains("Afficher");

	}

	public void ClickDropdown() {
		driver.findElement(list_dropdown).click();
	}

	public void ClickSecondWorkspace() {
		driver.findElement(list_secondworkspace).click();
	}

	public void Check_launch_app() throws InterruptedException {

		boolean chekapp = driver.findElement(Icone_app).isDisplayed();
		System.out.println(chekapp);
		if (chekapp) // true
		{
			System.out.println("relaunch app");
			driver.findElement(Icone_app).click();
			Thread.sleep(9000);
			ClickViewIncident();
			Thread.sleep(9000);

		} else // false
			System.out.println("app is already launched");
		{

		}

	}
}
