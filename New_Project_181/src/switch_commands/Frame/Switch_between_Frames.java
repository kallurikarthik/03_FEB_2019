package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_between_Frames {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    
	    //Switch to frame
	    driver.switchTo().frame("menuFrame");
	   
	    WebElement Fee_Structure=driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]"));
	    Fee_Structure.click();
	    Thread.sleep(5000);
	    
	    
	    //Get Control back to mainpage
	    driver.switchTo().defaultContent();
	    
	    
	    //Apply Switch to next frame using WebElement Reference
	    WebElement BodyFrame=driver.findElement(By.cssSelector("frame[title='bodyFrame']"));
	    driver.switchTo().frame(BodyFrame);
	    
	    //Identify Elemet Under BodyFrame
	    WebElement University_Dropdown=driver.findElement(By.id("univ"));
	    new Select(University_Dropdown).selectByIndex(3);

	}

}
