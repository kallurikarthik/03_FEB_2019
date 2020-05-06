package interactions.Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Shortcuts {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 			 //Launch browser
		driver.get("https://jqueryui.com/selectable/");  //Load webpage
		driver.manage().window().maximize();  			//maximize browser window
		Thread.sleep(5000);	
		
		
		
		//Cntrl+Alt+S  => Perform keyboard shortcut on automation browser
		new Actions(driver)
		.keyDown(Keys.CONTROL)
		.keyDown(Keys.ALT)
		.sendKeys(Keys.chord("s"))
		.perform();
		
		
		
		//Cntrl+S
		new Actions(driver)
		.keyDown(Keys.CONTROL)
		.sendKeys(Keys.chord("s"))
		.perform();
		
		
		
		
		//Type hello [Characters sequences at webpages..]
		new Actions(driver).sendKeys("Hello").perform();
		new Actions(driver).sendKeys(Keys.chord("hello")).perform();

		

	}

}
