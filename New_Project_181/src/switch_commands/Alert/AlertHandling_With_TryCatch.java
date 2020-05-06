package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_With_TryCatch 
{

	public static void main(String[] args)
	{
		/*
		 * Scenario:-->
		 * 		Job Search with invalid details
		 * 
		 * 		Given site url is "https://www.firstnaukri.com/"
		 * 		When user click search button witout enter data
		 * 		Then display popup window "Please select a Course or enter a Keyword"
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
	    driver.manage().window().maximize();
		
		//Identify search button
	    WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
	    Search_btn.click();
	    
	    
	    
	    /*
	     * Example:--> Write a program to handle survival popup.
	     * 			  Threse popus present at webpages optionally.
	     * 			  Handle alert when it was presented and ignore
	     * 			  when it is not presented..
	     */
	    
	    
	    try {
	    	
	    	 //switch to alert
		    driver.switchTo().alert();
		    System.out.println("Alert presented at browser window");
		   
		} catch (NoAlertPresentException e) {
			System.out.println("Alert not presented at browser window");
		}
	    
	    
	    
	    /*
	     * try-catch:-->
	     * 			is a exception handler it catch exception instead
	     * 			of interrupting run. After catching exception
	     * 			it continue run...
	     */
	    
	    
		
		
	}

}
