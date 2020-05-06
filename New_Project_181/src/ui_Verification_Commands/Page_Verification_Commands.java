package ui_Verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Get Current window page title
		String Runtime_title=driver.getTitle();
		System.out.println(Runtime_title);
		
		//Get Current Window page url
		String Runtime_url=driver.getCurrentUrl();
		System.out.println(Runtime_url);
		
		
		//Get Current Window ID
		String Dynamic_ID=driver.getWindowHandle();
		System.out.println(Dynamic_ID);
		
		
		//Get Current page Source
		String Runtime_Source=driver.getPageSource();
		System.out.println(Runtime_Source);
		

	}

}
