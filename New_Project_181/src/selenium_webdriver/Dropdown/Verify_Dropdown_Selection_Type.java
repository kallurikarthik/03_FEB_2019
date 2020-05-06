package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selection_Type 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		//Verify Dropdown is a single option selection or multiple selection type.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		
		/*
		 * Note:--> This is not a tester responsibility..
		 * using javascript convert single selection dropdown into multiple
		 * selection dropdown..
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//Verify Dropdown is a single option selection or multiple selection type.
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag1);
		
		
		

	}

}
