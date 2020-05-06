package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUP_Action {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 			 //Launch browser
		driver.get("https://jqueryui.com/selectable/");  //Load webpage
		driver.manage().window().maximize();  			//maximize browser window
		Thread.sleep(5000);	
		
		
		
		//Identify frame and switch to it
		WebElement Demo_Frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(Demo_Frame);
		
		
		//Perform control down keys at automation browser
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		//Select items under frame
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		
		//keyup control key
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		
		

	}

}
