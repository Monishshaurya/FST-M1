package JavaSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity6 {

	public static void main(String[] args)
	{
		
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
     // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
		
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        // Check if it is selected

        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        checkbox.click();

        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        driver.quit();


		

	}

}
