package framework.testng.CrossBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	public WebDriver driver;
	String path="Drivers\\";
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched");
			break;
			
		case "chrome":
			//Set Runtime environment variable for chrome driver
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome browser launched");
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver",path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			Reporter.log("IE browser launched");
			break;
				
		default:System.out.println("browser mismatch");
			Reporter.log("Browser name mismatch");
			break;
		}
	}
	
	
	@Test(priority=1)
	@Parameters("Application_url")   //Parameter from suite file
	public void loadApp(String url) throws Exception
	{
		Thread.sleep(5000);
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("Application url loaded And browser maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Implicit wait managed");
	}
	
	
	@Test(priority=2)
	public void flight_search() throws Exception
	{
		Thread.sleep(5000);
		
		//Type referal text into textbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		Reporter.log("departure city selected");
				
		//Type text
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("J"+Keys.ARROW_RIGHT+"AI");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
		System.out.println("arrival city selected");
		
		//select date from datepicker
		driver.findElement(By.linkText("24")).click();
		Reporter.log("departure date selected");

	}
	
	@Test(priority=3)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Browser closed");
	}
	

}
