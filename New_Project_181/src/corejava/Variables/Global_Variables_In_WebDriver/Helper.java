package corejava.Variables.Global_Variables_In_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver;
	String Username;
	String Password;
	String Url;
	String chrome_driver_path;
	
	//Declaring all webpage locations as global variable.
	By Email_loc=By.xpath("//input[@id='email']");
	By Password_loc=By.xpath("//input[@id='pass']");
	By Login_btn_locator=By.xpath("//input[@value='Log In']");
	
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", chrome_driver_path);
		driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	
	public void User_SignIn()
	{
		driver.findElement(Email_loc).clear();
		driver.findElement(Email_loc).sendKeys(Username);
		
		driver.findElement(Password_loc).clear();
		driver.findElement(Password_loc).sendKeys(Password);
		
		driver.findElement(Login_btn_locator).click();
	}
	
	
}
