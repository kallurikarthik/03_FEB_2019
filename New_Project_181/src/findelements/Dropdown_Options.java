package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Options {

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identifying month dropdown location
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		
		//Finding list of options under month dropdown
		List<WebElement> Month_options=Month_Dropdown.findElements(By.tagName("option"));
		System.out.println("Month Option available "+Month_options.size());
		
		
		//Get single option element using index number
		WebElement fifth_option=Month_options.get(5);
		fifth_option.click();
		Thread.sleep(5000);
		
		
		//Write a loop to select all options
		for (int i = 1; i < Month_options.size(); i++) 
		{
			WebElement object=Month_options.get(i);
			//Get Option name
			String OptionName=object.getText();
			System.out.println(OptionName);
			
			//Perform click action on Eachoption
			object.click();
		}
		
		
		
		
		
		
		//Identify Year dropdown
		WebElement Year_Dropdown=driver.findElement(By.id("year"));
		//Using Select class identify list of options under dropdown
		List<WebElement> Year_options=new Select(Year_Dropdown).getOptions();
		
		//Iteratefor All options using foreach loop
		for (WebElement Eachoption : Year_options) 
		{
			Eachoption.click();
			Thread.sleep(500);
		}
		
		
	}

}
