package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5
{
	
	 WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/crm");
			WebElement userName = driver.findElement(By.id("user_name"));
			WebElement password = driver.findElement(By.id("username_password"));
			WebElement login = driver.findElement(By.id("bigbutton"));
			
			userName.sendKeys("admin");
			password.sendKeys("pa$$w0rd");
			login.click();
		}
		@Test
		public void colorOfNavigation() {
			WebElement navigationMenu = driver.findElement(By.cssSelector(".desktop-toolbar"));
			System.out.println("The color of the navigation bar is: "+navigationMenu.getCssValue("color"));
		}
		@AfterClass
		public void tearDown() {
			driver.quit();
		}	
	
	
	
	

}
