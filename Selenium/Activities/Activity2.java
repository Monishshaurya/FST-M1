package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");

		String pageTitle=driver.getTitle();
		
        System.out.println("Page title is: " +pageTitle );
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.id("password")).sendKeys("password");
       driver.findElement(By.xpath("//button[text()='Submit']")).click();
       String message = driver.findElement(By.tagName("h1")).getText();
       System.out.println(message);

       // Close the browser
       driver.quit();
		
		
		
	}

}
