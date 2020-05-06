package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\gmail.com");
		driver.manage().window().maximize();
		
		//Type email at editbox and hit enter keyboard shortcut
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		
		Thread.sleep(4000);   //Static timegap to load password page
		
		//Type password at editbox and hit enter keyboard shrotcut
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Newpwd12345",Keys.ENTER);
		
		
		
		

	}

}
