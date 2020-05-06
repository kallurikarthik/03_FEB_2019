package framework.testng.Suite_Parameter;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	String path="Drivers\\";
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Browsername  parameter mismatch");
		}
		
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Application load finished");
		
		driver.manage().window().maximize();
		Reporter.log("Browser maximize finished");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Reporter.log("30 seconds implicit wait assigned");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid, String Apwd)
	{
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys(Auid);
		Reporter.log("Email enter finished");
		
		WebElement Passoword_EB=driver.findElement(By.id("pass"));
		Passoword_EB.clear();
		Passoword_EB.sendKeys(Apwd);
		Reporter.log("Password Enter finished");
		
	}
	
	
	@Test(priority=3)
	@Parameters("Fname")
	public void User_registration(String Firstname)
	{
		WebElement Firstname_EB=driver.findElement(By.name("firstname"));
		Firstname_EB.clear();
		Firstname_EB.sendKeys(Firstname);
		Reporter.log("Surname entry finished");
	}
	
	
	
	

}
