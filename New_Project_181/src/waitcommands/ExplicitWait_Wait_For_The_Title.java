package waitcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_The_Title 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//Manage Explicit timeout until expected title presented at browser window
		new WebDriverWait(driver, 40).until
		(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		System.out.println("title verified for selenium homepage");
		
		WebElement Dowbload_btn=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		Dowbload_btn.click();
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Download title verified");
		
		
		
		
		
		
		
		

	}

}
