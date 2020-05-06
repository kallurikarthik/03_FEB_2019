package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Webdriver_Script 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello123"+Keys.ENTER);
		

	}

}
