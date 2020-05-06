package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_Scroll
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Scroll window  [Vertical]
		((JavascriptExecutor)driver).executeScript
		("window.scroll(100,700)");
		
		
		
		//Scroll window [Horizontal]
		((JavascriptExecutor)driver).executeScript
		("window.scroll(400,100)");
		
		
		//Create popup using javascript
		((JavascriptExecutor)driver).executeScript("return alert('Tc001 Executed')");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		

		
		
		
		
		
		
		
	}

}
