package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_login 
{
	static WebDriver driver;
	static String url="http:/facebook.com";

	

	@Test
	public void FB_Login_Without_Email() 
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("hello12345");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		System.out.println("Without email Validation Completed");
		
	}
	

	@Test
	public void FB_Login_Without_Password() 
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		System.out.println("Without Password Validation completed");
		
	}
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
		
	}

}
