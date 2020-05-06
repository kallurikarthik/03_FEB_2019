package corejava.Loops;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String links[]={"Sign Up","Log In","Messenger","People"
				,"Pages","Games","Terms","Services","Careers","Cookies","Developers"};
		
		
		//Iterate for number of links
		for (String Eachlink : links) 
		{
			
			//CLick Each Link
			driver.findElement(By.linkText(Eachlink)).click();
			
			Thread.sleep(2000);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\footerlinks\\"+Eachlink+".PNG"));
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		

	}

}
