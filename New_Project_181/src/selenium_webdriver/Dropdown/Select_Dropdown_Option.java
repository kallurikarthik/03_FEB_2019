package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Option {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Using select class select dropdown with visible option name
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("25");
		
		//Using select class select dropdown with visible option name
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sept");

		//Using select class select dropdown with visible option name
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
	}

}
