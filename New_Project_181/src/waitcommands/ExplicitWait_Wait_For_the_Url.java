package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_the_Url 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//IDentify Location at webpage
		WebElement Messenger_link=driver.findElement(By.linkText("Messenger"));
		Messenger_link.click();
		
		
		//Mange timegap until expected url presented at webpage
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.urlContains("https://www.messenger.com/"));
		System.out.println("Url Verified for Messenger homepage");
		
		
		
		

	}

}
