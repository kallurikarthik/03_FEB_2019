package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Switch to frame
		driver.switchTo().frame("message");
		
		//Identify Location under message frame
		driver.findElement(By.xpath("//a[contains(.,'Official Login')]")).click();
		
		
		//Get All Dynamic Window ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		
		//Convert all Window ID's into iterators.
		Iterator<String> iterators=AllWindowIDS.iterator();
		
		//Read Each iterator using Next Keyword
		String W1=iterators.next();
		driver.switchTo().window(W1);
		System.out.println("Current window title is => "+driver.getTitle());
		
		String W2=iterators.next();
		driver.switchTo().window(W2);
		System.out.println("Curent window title is => "+driver.getTitle());
		

	}

}
