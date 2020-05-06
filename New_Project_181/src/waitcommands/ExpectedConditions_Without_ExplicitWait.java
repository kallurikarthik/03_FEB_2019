package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Without_ExplicitWait 
{

	public static void main(String[] args) 
	{
		
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		boolean flag=ExpectedConditions.titleContains("Facebook").apply(driver);
		System.out.println("Facebook homepage tilte status is => "+flag);
		
		
		boolean flag1=ExpectedConditions.urlToBe("https://www.messenger.com/").apply(driver);
		System.out.println("Facebook homepage url status is => "+flag1);
		
		
		//Verify alert presented at webpage
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
			System.out.println("alert presented");
		else
			System.out.println("Alert not presented");

	}

}
