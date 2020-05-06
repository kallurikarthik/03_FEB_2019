package ui_Verification_Commands;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Editbox_input_value 
{

	public static void main(String[] args)
	{
		
		/*
		 * Scenario:
		 * 			Given site url is "http://spiceject.com"
		 * 			Then verify departure date matching with current system date..
		 */
		
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.spicejet.com/");			  
		driver.manage().window().maximize();
	
		
		//Target location of departure date editbox
		WebElement Departure_Date_Loc=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		//Get Actual date displayed at editbox
		String Act_Dep_Date=Departure_Date_Loc.getAttribute("value");
		System.out.println(Act_Dep_Date);
		
		
		//Get Default system date
		Date d=new Date();
		//Create simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Conver Default date using simple date format
		String System_date=sdf.format(d);
		System.out.println(System_date);
		
		
		//Write decision to verify Departure date and system date
		if(Act_Dep_Date.equals(System_date))
			System.out.println("As expected Deparute date displayed current system date");
		else
			System.out.println("Wrong Date displayed at Departure date");
		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2020]
		 * 		  yy =>    year   [20]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
		
		
	}

}
