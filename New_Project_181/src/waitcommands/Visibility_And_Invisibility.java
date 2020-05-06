package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility_And_Invisibility {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Manage Explicit wait at automation browser
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		WebElement Oneway_Rbtn=driver.findElement(By.xpath("//input[@value='OneWay']"));
		WebElement Roundtrip_Rbtn=driver.findElement(By.xpath("//input[@value='RoundTrip']"));
		
		//Select Roundtrip Radiobutton
		Roundtrip_Rbtn.click();
		
		//wait Until Return date visible at webage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ReturnDate")));
		System.out.println("Element visible at webpage");
		
		//select Onway radio button
		Oneway_Rbtn.click();
		
		//wait untile Return date hidden from webpage
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ReturnDate")));
		System.out.println("Element invisible at webpage");
		
		
		By Hyd_City=By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		wait.until(ExpectedConditions.presenceOfElementLocated(Hyd_City));
		System.out.println("Element Presented at Source");
		
	}

}
