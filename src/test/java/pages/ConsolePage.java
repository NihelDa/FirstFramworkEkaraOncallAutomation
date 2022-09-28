package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsolePage {
	
	WebDriver driver;
	By list_dropdown = By.id("com.iplabel.ekaraoncall:id/spinner04");
	By list_Secondworkspace = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");   
    String NameScenario1 = "Scenario_1";
    String NameScenario2 = "Scenario2";
    String NameScenario4 = "Scenario4";
	By list_Thirdworkspace = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView");   
    
	public ConsolePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickDropdown() {
		driver.findElement(list_dropdown).click();
	}

	public void ClickSecondWorkspace() {
		driver.findElement(list_Secondworkspace).click();
	}

	
	public void CheckSecondWorkspaceDisplayed() {
		driver.getPageSource().contains(NameScenario2);
		driver.getPageSource().contains(NameScenario4);

	}
	public void ClickThirdWorkspace() {
		driver.findElement(list_Thirdworkspace).click();
	}

	
	public void CheckThirdWorkspaceDisplayed() {
		driver.getPageSource().contains(NameScenario1);

	}

}
