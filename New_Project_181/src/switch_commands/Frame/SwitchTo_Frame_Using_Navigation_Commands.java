package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Commands {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    //navigate to Frame
	    driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
	   
		//Identify Location Underframe
		WebElement Email_Editbox=driver.findElement(By.id("email"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("info.dsnr@gmail.com");
		
		WebElement TripId=driver.findElement(By.id("tripidSecond"));
		TripId.clear();
		TripId.sendKeys("446464646");
		
		
		
		

	}

}
