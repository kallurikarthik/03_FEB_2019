package corejava.Variables.WebElement_Reference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_And_WebElement_Reference 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Script Without Any refernce
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Script with WebElement Reference
		WebElement Signin_PWD=driver.findElement(By.id("pass"));
		Signin_PWD.clear();
		Signin_PWD.sendKeys("Hello123456");
		
		/*
		 * Above reference storing page location,If page chanaged at runtime
		 * reference wil become empty. And WebDriver throw exception as
		 * 		"StaleElementReference"  Exception.
		 */
	
		//Script with locator reference
		By Signin_btn_loc=By.xpath("//input[@value='Log In']");
		driver.findElement(Signin_btn_loc).click();
		
	
		
		
	}

}
