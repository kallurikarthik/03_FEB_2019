package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Next_Page_Records 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx#");
		driver.manage().window().maximize();
		
		//Identify market link
		WebElement markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		markets_link.click();
		
		//Target Nifty table
		WebElement Nifty_link=driver.findElement(By.xpath("//a[@title='Nifty Weightage']"));
		Nifty_link.click();
		
		//Target table
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Find list of rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Row Count is => "+rows.size());
		
		int count=0;
		for (int i = 0; i < rows.size(); i++) 
		{
			
			 String RowText=rows.get(i).getText();
			 System.out.println(RowText);
			 
			 
			//This condition accept on count reach to 20
			 if(count==20)
			 {
				 WebElement Next_btn=driver.findElement(By.xpath("//th[@class='table-page:next']"));
				 Next_btn.click();
				 count=0;  
			 }
			 count=count+1;
			
		}
		
		
	}

}
