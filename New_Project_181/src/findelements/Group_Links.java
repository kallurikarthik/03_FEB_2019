package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector("div.col.col18 > nav:nth-child(1) > ul"));
		
		
		//Find List of links under footerarea
		List<WebElement> Footer_links;
		Footer_links=Footer_Area.findElements(By.tagName("a"));
		
		//Get count of objects
		System.out.println("Count of objects are => "+Footer_links.size());
	
		
		//Iterate for number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			
			WebElement Eachlink=Footer_links.get(i);
			
			//Get Linkname and href attribute at runtime
			String Linkname=Eachlink.getText();
			String Linkhref=Eachlink.getAttribute("href");
			System.out.println(Linkname+" ==>  "+Linkhref);
			
			//CLick Each link
			Eachlink.click();
			Thread.sleep(2000);
			
			//Navigate back to homepage
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all identifications to avoid "StaleElementReference" Exception
			Footer_Area=driver.findElement(By.cssSelector("div.col.col18 > nav:nth-child(1) > ul"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
			
		}
		
		
		

	}

}
