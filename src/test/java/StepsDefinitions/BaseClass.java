package StepsDefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static WebDriver driver = null;

	@BeforeTest
	public void setup() {

		DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A50");
		caps.setCapability(MobileCapabilityType.UDID, "R58M33X6VHV");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 180);
		// caps.setCapability(MobileCapabilityType.TIMEOUTS,300);
		// caps.setCapability("appPackage","com.iplabel.ekaraoncall");
		// caps.setCapability("appActivity","com.iplabel.ekaraoncall.AuthenticationActivityEkara");
		caps.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\Nihel\\eclipse-workspace\\AutomationEkaraOnCallProject\\src\\test\\resources\\apps\\EkaraOnCall.apk");
		// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");

		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
