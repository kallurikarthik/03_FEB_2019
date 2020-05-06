package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Reusable_Method 
{
	static WebDriver driver;
	
	

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
		
		
		switchto_window("Seat Availability");
		System.out.println("Window title is => "+driver.getTitle());
		
		switchto_window("Train Reservation");
		System.out.println("Window title is => "+driver.getTitle());
		
		switchto_window("PNR Status");
		System.out.println("Window title is => "+driver.getTitle());
		
		
		
				
	}
	
	
	//Reusable method for switch to window
	public static void  switchto_window(String Exp_title)
	{
		//Get All Dynamic window ID's
		Set<String> allwindowIDS=driver.getWindowHandles();
				
		//Iterate for All windowID's
		for (String EachWindowID : allwindowIDS) 
		{
			//switch to each window
			driver.switchTo().window(EachWindowID);
			
			//Get Current Window title
			String Runtime_title=driver.getTitle();
			
			//Decision to accept on Expected Title match
			if(Runtime_title.contains(Exp_title))
			{
				break; //Break the loop on expected title found
			}
					
					
			}//for
		
		
	}//window method

}
