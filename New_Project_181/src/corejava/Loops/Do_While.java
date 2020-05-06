package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While {

	public static void main(String[] args) 
	{
		

		/*
		 * Do-while:-->
		 * 		Do-while is a condition loop it work similar as
		 * 		while loop . but only difference do-while execute
		 * 		once even  condition return false.
		 */
		
		
		//Example:--> Print numbers 1 to 10
		
		int i=1;
		do {
			System.out.println(i);
			i=i+1;
		} while (i <=10);
		
		
		//Do-while false condition
		int j=100;
		do {
			System.out.println(j);
			j=j+1;
		} while (j<10);
		
		
		
		
		
		/*
		 * Example:--> Using do-while write a program to reload page
		 * 				until expected page found..
		 */
		
		//Browser Initiation
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		boolean flag=false;
		int count=0;
		do {
			
			
			driver.get("http://google.com");
			
			try {
				new WebDriverWait(driver, 15)
				.until(ExpectedConditions.titleContains("Facebook"));
				flag=true; //assign true only page title verified
			} catch (Exception e) {
				flag=false;
			}
			
			
			if(count==10)
			{
				break;
			}
			count=count+1;
			
			
			
		} while (flag==false);
		
		System.out.println("Page title found");
		
		
		
		
		
		
		
		
		
		

	}

}
