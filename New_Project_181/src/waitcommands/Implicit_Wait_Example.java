package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		System.out.println("Browser Launch Finished");	
		
		driver.findElement(By.id("email"));
		System.out.println("Element IDentified");
		
		
		driver.findElement(By.id("identifierId"));
		System.out.println("Element IDentified");
		
		
		//Define Implicit wait for Browser window
		driver.manage().timeouts()
		.implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(60, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		
		
		
		
	}

}
