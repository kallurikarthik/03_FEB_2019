package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_options_Within_Single_Dropdown {

	public static void main(String[] args) throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	
		/*
		 * Note:--> This is not a tester responsibility..
		 * using javascript convert single selection dropdown into multiple
		 * selection dropdown..
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//Verify Dropdown is a single option selection or multiple selection type.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		
		
		//Decision statement to accept on dropdown multiple selection type
		if(flag==true)
		{
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();   //Deselect possible only on multiple selection dropdown
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(5);
			State_Dropdown.selectByIndex(7);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		

	}

}
