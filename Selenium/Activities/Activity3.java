package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 
{
	
	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");

		String pageTitle=driver.getTitle();
		
        System.out.println("Page title is: " +pageTitle );
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        String message = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
        System.out.println(message);
        driver.quit();
		
	}

	
	
	
	
	
	
	
	

}
