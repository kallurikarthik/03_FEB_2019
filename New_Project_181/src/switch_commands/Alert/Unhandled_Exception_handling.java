package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unhandled_Exception_handling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();

		try {
		
			//Identify search button
		    WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		    Search_btn.click();
			
		} catch (UnhandledAlertException e) {
			System.out.println("Alert presented at page");
		}

	}

}
