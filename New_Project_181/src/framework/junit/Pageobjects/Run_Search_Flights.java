package framework.junit.Pageobjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Search_Flights 
{
	static WebDriver driver;
    static CT_SearchFlights flights;
    static CT_SearchTrain trains;

	@Test
	public void Verify_Flight_Search() 
	{
		driver.get("https://www.cleartrip.com/");
		flights.Enter_From_City("HYD");
		flights.Select_HYD_City();
	}
	
	@Test
	public void Verify_Train_Search() throws Exception
	{
		driver.get("https://www.cleartrip.com/trains");
		trains.To_AEB.clear();
		trains.To_AEB.sendKeys("HYD");
		Thread.sleep(5000);
		trains.From_HYD_City.click();
	}
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get Pageobjects
		flights=new CT_SearchFlights(driver);
		trains=new CT_SearchTrain(driver);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}

}
