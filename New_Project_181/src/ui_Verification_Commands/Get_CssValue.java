package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue 
{

	public static void main(String[] args) throws Exception 
	{
		
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//IDentifying sensex tab
		WebElement SenSex_TAB=driver.findElement(By.id("InvestRec"));
		
		//Get Element background color
		String BG_Color=SenSex_TAB.getCssValue("background-color");
		System.out.println("BG color before selection is => "+BG_Color);
		
		//Click on Sensex tab
		SenSex_TAB.click();
		Thread.sleep(2000);
		
		//Get Element Background color
		String BG_Color1=SenSex_TAB.getCssValue("background-color");
		System.out.println("BG color after selection is =. "+BG_Color1);
		
		if(BG_Color1.equals("rgba(231, 120, 23, 1)"))
			System.out.println("Sensex tab is active");
		else
			System.out.println("Tab Selection failed");
		
		
		
		
		

	}

}
