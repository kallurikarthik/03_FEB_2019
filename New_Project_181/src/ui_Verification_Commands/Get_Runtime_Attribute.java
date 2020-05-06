package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:
		 * 			Given site url is "https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx"
		 * 			When user click on Sensex tab
		 * 			Then Verify Sensex tab is selected
		 * 			And displayed sesex details at bottom of sensex tab..
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//IDentifying sensex tab
		WebElement SenSex_TAB=driver.findElement(By.id("InvestRec"));
		//Click on Sensex tab
		SenSex_TAB.click();
		
		//Get Runtime Attribute value 
		String Runtime_Class=SenSex_TAB.getAttribute("class");
		
		//Decision to verify Sensex tab is selected
		if(Runtime_Class.contains("tab-active"))
		{
			System.out.println("As expected Sensex tab is selected");
			Thread.sleep(5000);
			
			WebElement Sensex_Score_location=driver.findElement(By.xpath("//*[@id=\"frm\"]/div[2]/div[1]/span[2]"));
			System.out.println(Sensex_Score_location.getText());
		}
		else
			System.out.println("Testfail:  Sensex tab is not selected");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
