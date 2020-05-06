package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Select radio button  [For selection fo radio button in webdriver we follow Click method]
		driver.findElement(By.id("RoundTrip")).click();
		
		//Type referral keyword into Automation ComplteEditbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("VIZ");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Type referral keyword into autocomplete editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//Select Departure date 
		driver.findElement(By.linkText("27")).click();
		
		/*
		 * Type Date into return date editbox.Type only when editbox
		 * is in writable mode.
		 */
		driver.findElement(By.id("ReturnDate")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ReturnDate")).sendKeys("Sat, 25 Apr, 2020");
		
		//select adults dropdown
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("5");
		
		//CLick link with partial name
		driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
		
		//Select airlines from autocomplete editbox
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara (UK)");
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		//CLick Search flight button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
