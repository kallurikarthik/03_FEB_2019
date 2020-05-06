package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Enable Javascript on Automation browser.
		JavascriptExecutor js=((JavascriptExecutor)driver);

		//Type text into editbox using javascript..
		js.executeScript("document.getElementById('email').value='9030248855'");
		js.executeScript("document.getElementById('pass').value='Hello123456'");
		
		//Javascript Executor object identification using xpath locator builder
		WebElement Firstname_EB=driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].value='AAkash'", Firstname_EB);
		
		WebElement Surname_EB=driver.findElement(By.cssSelector("input[name='lastname']"));
		js.executeScript("arguments[0].value='varma'", Surname_EB);
		
		//Dropdown Selection using javascript..
		js.executeScript("document.getElementById('day').value='10'");
		
		//Identification using xpath
		WebElement Month_DD=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		js.executeScript("arguments[0].value='7'", Month_DD);
		
		
		//Radio button selection using javascript
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked='true'", Female_Rbtn);
		Thread.sleep(4000);
		
		//Radio button selection using javascript...
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
		Thread.sleep(4000);
		
	}

}
