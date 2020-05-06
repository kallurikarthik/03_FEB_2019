package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Get Current window Dynamic ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    //Click Hyper link at Current Browser Window
	    WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_link.click();
	    
	    //Get All window Dynamic ID's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    //Iterate for number of windows
	    for (String EachWindowID : AllWindowIDS) 
	    {
			if(!EachWindowID.equals(MainWindowID))
			{
				driver.switchTo().window(EachWindowID);

			}
		}
	    
	    //Get Current Window Tilte
	    System.out.println("Current window title is => "+driver.getTitle());
	    
	    Thread.sleep(5000);
	    WebElement Mobile_EB=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	    Mobile_EB.clear();
	    Mobile_EB.sendKeys("9030248855");
	    
	    
	    Thread.sleep(5000);
	    //Switch Control back to mainpage
	    driver.switchTo().window(MainWindowID);
	    
	    //Get Current Window Tilte
	    System.out.println("Current window title is => "+driver.getTitle());
	    
	    
	    
	    
	    

	}

}
