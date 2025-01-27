package JavaSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity7 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page	
        System.out.println("Page title: " + driver.getTitle());
      WebElement textField= driver.findElement(By.id("textInput"));
      System.out.println("Input field is enabled: " +textField.isEnabled());
      driver.findElement(By.id("textInputButton")).click();
      System.out.println("Input field is enabled: " +textField.isEnabled());
      textField.sendKeys("Mounika");
      System.out.println(textField.getAttribute("value"));
      driver.quit();


		
		

	}

}
