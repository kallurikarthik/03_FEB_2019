package framework.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_TestCase 
{
  WebDriver driver;
  String Driver_path="Drivers\\";
  String url="http://facebook.com";
  
  
  
  @Test(priority=0)
  public void Verify_Signup_link() throws Exception
  {
	  driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
	  Thread.sleep(5000);
	  Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	  Reporter.log("Signup link title verified");
  }
  
  
  
  @Test(priority=1)
  public void Verify_Messenger_link() throws Exception
  {
	  driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
	  Thread.sleep(5000);
	  Assert.assertEquals(driver.getTitle(), "Messenger");
	  Reporter.log("Messenger page verified");
  }
  
  
  
  

  @BeforeMethod
  public void beforeMethod()
  {
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("screens\\"+method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
