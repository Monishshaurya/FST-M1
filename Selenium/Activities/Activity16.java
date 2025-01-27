package JavaSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
	
		WebElement dropdown=driver.findElement(By.xpath("//select[@class=\"h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg\"]"));
		Select select =new 	Select(dropdown);
		select.selectByIndex(2);
		System.out.println("Second option: " +select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Three");
		System.out.println("Second option: " +select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Four");
		System.out.println("Second option: " +select.getFirstSelectedOption().getText());
		List<WebElement>dropdownelement=select.getOptions();
		for(WebElement option:dropdownelement)
		{
			System.out.println(option.getText());
		}
		
		driver.quit();
		

	}

}
