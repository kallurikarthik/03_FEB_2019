package javascript_executor;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Highlight_element 
{

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
			
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify element
		WebElement Reg_header=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		
		//Highlight text using jsexecutor
		js.executeScript("arguments[0].style.backgroundColor='yellow'",Reg_header);
		
		//Set outline for text
		js.executeScript("arguments[0].style.outline ='red solid 2px'",Reg_header);
		Thread.sleep(5000);
		
		
		//take screen shot of webpage
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\Signup_header.png"));
		
		
		
		
		//To clear javascript executor effects refresh page once
		driver.navigate().refresh();
		
		

		
	}

}
