package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Date_From_DatePicker {

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
		
		String Exp_month="July 2020";
		String Exp_Date="12";
		
		
		for (int i = 0; i < 4; i++) 
		{
			
			//Identify Active month table
			WebElement Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//IDenitfy active month header
			WebElement Active_month_Header_Location=Active_month.findElement(By.xpath("//th[@class='month']"));
			
			//Get Header Text
			String Header_Text=Active_month_Header_Location.getText();
			System.out.println(Header_Text);
			
			if(Header_Text.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_Date)).click();
				break; //After clicking expected break loop
			}
			
			
			
			WebElement Next_Month_Btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_Month_Btn.click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		

	}

}
