package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_Source 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Get Current Page Source
		String Runtime_page_source=driver.getPageSource();
		
		//Decision to verify expected source available at pagesource..
		if(Runtime_page_source.contains("email"))
		{
			WebElement Email_EB=driver.findElement(By.id("email"));
			Email_EB.clear();
			Email_EB.sendKeys("9030248855");
		}
		else
		{
			System.out.println("Element Not presented at source");
		}
		
		
		
		

	}

}
