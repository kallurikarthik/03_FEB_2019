package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Group_of_Options 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		
		String Exp_cities[]= 
			{
				"Please select state first",
				"South Andaman",		
				"Anantapur",
				"East Siang",
				"Darrang",
				"Aurangabad",
				"Chandigarh",
				"Jashpur",
				"fgdfgfdgfd",
			};
		
		
		
		//Identify state dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Find list of options under dropdown
		List<WebElement> State_Options=State_Dropdown.findElements(By.tagName("option"));
		
		
		for (int i = 0; i < 9; i++) 
		{
			//Get Each State using index number
			WebElement State=State_Options.get(i);
			String StateName=State.getText();
			State.click();
			Thread.sleep(5000);
			
			
			//Identify city dropdown
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			String All_Cities=City_Dropdown.getText();
			
			
			
			//Verify In All cities expected city available
			if(All_Cities.contains(Exp_cities[i]))
			{
				System.out.println("for state => "+StateName+"  city displayed => "+Exp_cities[i]);
			}
			else
			{
				System.out.println("for state => "+StateName+"  city not displayed => "+Exp_cities[i]);
			}
			
			
		}
		
		
		

	}

}
