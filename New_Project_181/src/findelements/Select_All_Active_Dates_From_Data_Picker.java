package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_All_Active_Dates_From_Data_Picker {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement Date_picker=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		Date_picker.click();
		Thread.sleep(3000);
		
		
		for (int i = 0; i < 5 ; i++) 
		{
			
	
			//Identify Active month table
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Identify active links
			List<WebElement> Active_links;
			Active_links=Active_month.findElements(By.tagName("a"));
			
			
			//Innerloop to iterate number of active links
			for (int j = 0; j < Active_links.size(); j++) 
			{
					//Get Each link
					Active_links.get(j).click();
					Thread.sleep(500);
					
					Date_picker.click();
					Thread.sleep(1000);
					
				//Restore Datapicker identification to avlid stateElement Reference exception	
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=Active_month.findElements(By.tagName("a"));	
			}
			
			
			
			WebElement Next_Month_Btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_Month_Btn.click();
			System.out.println("Next month button Clicked");
			Thread.sleep(2000);
			
			if(i==3)
			{

				//Identify Active month table
				WebElement Second_Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				System.out.println("Second month identified");
				
				Second_Active_month.findElements(By.tagName("a")).get(0).click();
				Thread.sleep(1000);
				
				Date_picker.click();
				Thread.sleep(2000);
				
			}
			
		}
		
		

	}

}
