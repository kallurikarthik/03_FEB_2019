package selenium_webdriver.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		//Select dropdown using visibletext of option
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		//Select dropdown using option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		//Type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Select dropdown option using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4);
		
		//Select checkbox [For selection and deselection of chekcbox we follow click method.]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//Click Signin button
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
