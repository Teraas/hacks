import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class Sample extends BaseTest {

    @BeforeClass
    public void setUpTest() throws Exception {
        setUp();
    }

    @Test
    public void testLogin() {
        // Find and interact with elements
        MobileElement usernameField = driver.findElementById("com.example:id/username");
        MobileElement passwordField = driver.findElementById("com.example:id/password");
        MobileElement loginButton = driver.findElementById("com.example:id/login");

        usernameField.sendKeys("testuser");
        passwordField.sendKeys("password123");
        loginButton.click();

        // Validate successful login
        MobileElement welcomeMessage = driver.findElementById("com.example:id/welcome");
        assert welcomeMessage.getText().contains("Welcome");
    }

    @AfterClass
    public void tearDownTest() {
        tearDown();
    }
}
