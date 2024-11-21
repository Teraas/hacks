import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AppiumDriver<MobileElement> driver;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0"); // Adjust as per your device
        caps.setCapability("deviceName", "emulator-5554"); // Use adb devices to check
        caps.setCapability("app", "/path/to/your/app.apk"); // Path to APK file
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
