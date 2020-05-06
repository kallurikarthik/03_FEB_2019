package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_url_Presented {

	public static void main(String[] args) 
	{
		/*
		 * Scenario:-->
		 * 			Given url is http://seleniumhq.dev
		 * 			When User Click on download link
		 * 			Then system display expected Download page.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//Get current window url
		String Runtime_page_url=driver.getCurrentUrl();
		
		//Store Expected url
		String Exp_url="https://www.selenium.dev/";
		
		//Verify Runtime page url contains Expected url
		boolean flag=Runtime_page_url.contains(Exp_url);
		
		//Decison to verify url presented at webpage
		if(flag==true)
		{
			System.out.println("Expected homepage displayed");
			
			//Click no Download button
			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			//Decision to validate expected url presented at downloads page
			if(driver.getCurrentUrl().contains("/downloads/"))
			{
				System.out.println("Testpass :--> Download page displayed");
			}
			else
			{
				System.out.println("Testfail :--> download page not displayed");
			}
			
		}
		else
		{
			System.out.println("Wrong title presented for homepage");
		}
		
		
		
	}

}
