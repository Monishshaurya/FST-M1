import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
public class Activity8 
{
	WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Server URL
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        // Open Selenium page
        driver.get("https://training-support.net/webelements/tabs");
    }

    @Test
    public void scrollIntoViewTest() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));

        // Just scroll
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Open A New Tab\"]")).click();

        // Scroll and locate elements
        //driver.findElement(AppiumBy.androidUIAutomator(
                //UiScrollable + ".scrollTextIntoView(\"Tab Opener\")"
        //)).click();

        // Wait for the page to load
        //wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Click Me!")));
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text=\"Open Another One\"]")));
        
        // Print page title
        String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"This is a New Tab!\"]")).getText();
        System.out.println("Page title is: " + pageTitle);

        // Assertion
        Assert.assertEquals(pageTitle, "This is a New Tab!");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }	
	
	
	
	
	
	
	
	
	

}
