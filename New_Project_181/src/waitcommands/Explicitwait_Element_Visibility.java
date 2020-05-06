package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Element_Visibility {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		//Roundtrip.click();
		
		
		new WebDriverWait(driver,20).until
		(ExpectedConditions.visibilityOfElementLocated
				(By.id("ReturnDate"))).click();
		System.out.println("Return data is visble and clicked");
		
		
		
		
		
		
		

	}

}
