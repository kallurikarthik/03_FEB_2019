package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_login {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of table driven data.
		 */
	
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Double dimensional runtime array
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
					{"Newuser6","Newpwd6"},
					{"Newuser7","Newpwd7"},
					{"Newuser8","Newpwd8"},
			};
		
	
		
		//Iterate for number of items under array
		for (int i = 0; i < userdata.length; i++)
		{
			String UID=userdata[i][0];
			WebElement Email_EB=driver.findElement(By.id("email"));
			Email_EB.clear();
			Email_EB.sendKeys(UID);
			
			String PWD=userdata[i][1];
			WebElement Password_EB=driver.findElement(By.id("pass"));
			Password_EB.clear();
			Password_EB.sendKeys(PWD);
			
			
			Thread.sleep(3000);
		}
		
		
		

	}

}
