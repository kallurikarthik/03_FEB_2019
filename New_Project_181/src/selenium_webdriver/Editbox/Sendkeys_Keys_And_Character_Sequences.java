package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendkeys_Keys_And_Character_Sequences 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("newuser",Keys.TAB,
				"webdriver",Keys.TAB,
				"newuserwebdriver@gmail.com",Keys.TAB,
				"newuserwebdriver@gmail.com",Keys.TAB,
				"Hello12345");
		
		
		//Selecting dropdown using keyboard shortcut
		driver.findElement(By.id("day")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Selecting dropdown using char sequences
		driver.findElement(By.id("month")).sendKeys("D");

		//Selecting dropdown using char sequences
		driver.findElement(By.id("year")).sendKeys("abc");
		System.out.println("year dropdown selected");
		
		
		/*
		 * Note:--> selenium have separate commands to select dropdown
		 * 			options.
		 */
		
		
	}

}
