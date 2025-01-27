package JavaSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args)
	{
		
        WebDriver driver = new FirefoxDriver();
       driver.get("https://training-support.net/webelements/target-practice");
       System.out.println("Page title: " + driver.getTitle());
      String thirdHeaderText =driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
      System.out.println(thirdHeaderText);
      // Find the 5th header and print its color
Color fifthHeaderColor =Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
      System.out.println(fifthHeaderColor.asRgb());
      System.out.println(fifthHeaderColor.asHex());
      // Find the purple button and print its classes

     String purpleButtonclass= driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
     driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
     
     // Find the slate button and print it's text.
     String SlateButtontext= driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
     System.out.println(SlateButtontext);

     driver.quit();


	}

}
