package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_Title_Presented {

	public static void main(String[] args) throws Exception 
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
		
		//Get Currnet page title
		String Runtime_Page_title=driver.getTitle();
		System.out.println("Currnt window title is => "+Runtime_Page_title);
		
		//Store Expected title
		String Exp_title="SeleniumHQ Browser Automation";
		
		
		//Verify equal comparision between Runtime and expected title
		boolean flag=Runtime_Page_title.equals(Exp_title);
		System.out.println("Expected Title status is => "+flag);
		
		//Write Decision to accept on valid title
		if(flag==true)
		{
			//Click no Download button
			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			//Write decision to validate download page title
			if(driver.getTitle().equals("Downloads"))
			{
				System.out.println("Testpass :-->As expected download page displayed");
			}
			else
			{
				System.out.println("TestFail:--> Download page title mismatch");
			}
			
		}
		else
		{
			System.out.println("Wrong title presented , Failed to click download button");
		}
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

	}

}
