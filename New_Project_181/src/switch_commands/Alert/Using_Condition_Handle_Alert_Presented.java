package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Using_Condition_Handle_Alert_Presented {

	public static void main(String[] args) {
		
		
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
	    //Search_btn.click();
	    
	    
	    
	    /*
	     * Example:--> Write a program to handle survival popup.
	     * 			  Threse popus present at webpages optionally.
	     * 			  Handle alert when it was presented and ignore
	     * 			  when it is not presented..
	     */
	    
	    //Decision to verify alert presented at browser window
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	 //switch to alert and store into reference variable
		    Alert alert_ref=driver.switchTo().alert();
		   
		    //Get text at alert window
		    String Alert_msg=alert_ref.getText();
		    System.out.println(Alert_msg);
		    
		    //Close alert window
		    alert_ref.accept();
	    }
	    else
	    {
	    	System.out.println("Alert was not presented");
	    }
	    
	}

}
