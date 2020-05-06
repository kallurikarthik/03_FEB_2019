package corejava.Variables.Global_Variables_In_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User3_Run_Helper {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://fb.com");
		driver.manage().window().maximize();
		
		
		Helper obj=new Helper();
		
		driver.findElement(obj.Email_loc).clear();		
		driver.findElement(obj.Email_loc).sendKeys("User3");
		
	}

}
