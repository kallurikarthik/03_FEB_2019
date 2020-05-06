package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to Frame using FrameId/Name property
		driver.switchTo().frame("modal_window");
		
		//Identify Location Underframe
		WebElement Email_Editbox=driver.findElement(By.id("email"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("info.dsnr@gmail.com");
		
		WebElement TripId=driver.findElement(By.id("tripidSecond"));
		TripId.clear();
		TripId.sendKeys("446464646");
		
		//Get Controls back to page from frame
		driver.switchTo().defaultContent();
		
		//Click on Flights page
		WebElement Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights.click();
		
		
		
	}

}
