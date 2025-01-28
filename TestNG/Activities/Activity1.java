package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1
{

    WebDriver driver;
    @BeforeClass
    public void setUp() 
    {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }	
	
    @Test(priority = 1)
    public void homePageTest() {
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "Training Support");
        driver.findElement(By.linkText("About Us")).click();
    }
	
	
    @Test(priority = 2)
    public void aboutPageTest() {
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
	
}
