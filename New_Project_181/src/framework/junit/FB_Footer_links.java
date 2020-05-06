package framework.junit;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Footer_links 
{

	static WebDriver driver;
	public @Rule TestName test=new TestName();  //This syntax helps to capture constructed method name
	
	@Test
	public void Verify_Signup_link() throws Exception 
	{
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		Thread.sleep(3000);
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup page tilte verified");
	}
	
	@Test
	public void Verify_Login_link() throws Exception 
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']"));
		Thread.sleep(3000);
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login page title verified");
	}

	
	@Test
	public void Verify_Messenger_link() throws Exception 
	{
		driver.findElement(By.xpath("//a[@title='Take a look at Messenger.']")).click();
		Thread.sleep(3000);
		Assert.assertEquals("Messenger",driver.getTitle());
		System.out.println("Messenger page title verified");
	}

	@Test
	public void Verify_Watch_link() throws Exception 
	{
		driver.findElement(By.xpath("//a[@title='Browse our Watch videos.']")).click();
		Thread.sleep(3000);
		Assert.assertEquals("Facebook Watch", driver.getTitle());
		System.out.println("Watch page title verified");
	}

	@Test
	public void Verify_Pages_link() throws Exception 
	{
		driver.findElement(By.xpath("//a[@href='/directory/pages/']")).click();
		Thread.sleep(3000);
		Assert.assertEquals("Pages directory", driver.getTitle());
		System.out.println("Pages title verified");
	}
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		//This statement take screen shot where browser is running, And convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+test.getMethodName()+".png"));
	}



}
