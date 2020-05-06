package selenium_webdriver.Dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Get_Commands {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Verify Month dropdown contain expected option
		List<WebElement> AllOptions=new Select(driver.findElement(By.id("month"))).getOptions();
		
		//get size of all options
		int count=AllOptions.size();
		
		if(count==13)
		{
			System.out.println("Expected Options available");
			
			/*
			 * Get is a method it fetch single object from collection of objects 
			 * using index number
			 */
			AllOptions.get(6).click();
		}
		else
		{
			System.out.println("Dropdown option count mismatch");
		}
		
		
		
	}

}
