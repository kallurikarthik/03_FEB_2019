package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Identification {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Identify button and press enter key..
		driver.findElement(By.className("orko-button-secondary")).sendKeys(Keys.ENTER);
		
		//Identifying firnatme with class property
		driver.findElement(By.className("ureg-fname")).clear();
		driver.findElement(By.className("ureg-fname")).sendKeys("Mindq");

		//Identifying surname with class property
		driver.findElement(By.className("ureg-lname")).clear();
		driver.findElement(By.className("ureg-lname")).sendKeys("DSNR");
		
		
	}

}
