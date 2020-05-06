package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);
		
		
		WebElement From_EB=driver.findElement(By.xpath("//input[@etitle='From']"));
		From_EB.clear();
		From_EB.sendKeys("HYD");
		new Actions(driver).pause(5000).sendKeys(Keys.ENTER).perform();
		
		
		WebElement To_EB=driver.findElement(By.xpath("//input[@name='destination']"));
		To_EB.clear();
		To_EB.sendKeys("DEL");
		new Actions(driver).pause(5000).sendKeys(Keys.ENTER).perform();
		
		
		//Press enter key to select current date
		new Actions(driver).pause(3000).sendKeys(Keys.ENTER).perform();
		
		
		
		


	}

}
