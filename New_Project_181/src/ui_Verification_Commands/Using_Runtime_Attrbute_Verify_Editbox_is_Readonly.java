package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Runtime_Attrbute_Verify_Editbox_is_Readonly {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Scenario:
		 * 			Given site url is "https://www.spicejet.com/"
		 * 			Then Verify departure editbox is redonly
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Identifying Departue Editbox
		WebElement Departure_Editbox=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		
		//Get Departure attribute value at runtime
		String Editbox_status=Departure_Editbox.getAttribute("readonly");
		System.out.println("Return value is => "+Editbox_status);
		
		//Decison to verify Readonly value
		if(Editbox_status.contains("true"))
		{
			System.out.println("Departure editbox is readonly");
		}
		else
		{
			System.out.println("Departure editbox is writable, Testfail");
		}
		
	

	}

}
