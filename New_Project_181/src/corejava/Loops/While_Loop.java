package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		
		/*
		 * Example:--> Print numbers from 1 to 10
		 */
		
		//While loop with true condition..
		int i=1;
		while(i <= 10)  
		{
		
			System.out.println(i);
			i=i+1;
		}
		
		//While loop with false condition
		int j=11;
		while(j <= 10)   //Because of false condition while loop ejects
		{
			j=j+1;
			System.out.println(j);
		}
		
		
		//While with infinity loop
		int k=0;
		while(k <10)
		{
			System.out.println(k);
			break;
		}
		
		
		
		
		/*
		 * Example:--> Manage explicit wait using while loop.
		 */
		
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		/*
		 * If retypeemail element not visible at webpage,  while loop accept 
		 * iteration and wait until element visible at webpage
		 */
		
		int m=0;
		while(!Retype_Email.isDisplayed())
		{
			Thread.sleep(1000);
			m=m+1;
			if(m==30)
			{
				throw new Exception("Element Not visible at webpage after timeout 30 seconds");
			}
		}
		
		System.out.println("Element displayed");
		
		

	}

}
