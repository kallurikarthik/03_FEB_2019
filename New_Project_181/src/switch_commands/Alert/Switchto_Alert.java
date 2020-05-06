package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Alert {

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
	    
	    //switch to alert and store into reference variable
	    Alert alert_ref=driver.switchTo().alert();
	    
	    //Get text at alert window
	    String Alert_msg=alert_ref.getText();
	    System.out.println(Alert_msg);
	    
	    //Close alert window
	    alert_ref.accept();
	    
	    String Exp_errmsg="Please select a Course or enter a Keyword";
	    
	    //Decision to verify expected and actual message
	    if(Alert_msg.equals(Exp_errmsg))
	    	System.out.println("Expected alert presented at browser window");
	    else
	    	System.out.println("Expected alert not presented at browser window");
	    
		

	}

}
