package method_return_keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Type 
{
	
	
	public void method1()
	{
		
		/*
		 * => Void type method doesn't return any value to methodname.
		 * => During Void method type no need to define return keyword
		 */
		
	}
	
	
	
	/*
	 * => Otherthan void all method types return value.
	 * => Method exit time it return value to method name
	 * => Method type and method return value should match.
	 */
	
	
	public String method2()
	{

		return "MQ_DSNR";
		
	}
	
	
	
	public boolean method3()
	{
		return false;
	}
	
	
	public WebElement Usenname(WebDriver driver)
	{
		return driver.findElement(By.id("email"));
	}
	

	public static void main(String[] args) 
	{
			
		//Create object for method type
		Method_Type obj=new Method_Type();
		obj.method1(); //Methdo without return type
		
		String Inst_name=obj.method2();   //Method with string return type
		System.out.println(Inst_name);
		
		boolean flag=obj.method3();
		System.out.println("Method 3 return status is => "+flag);
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		obj.Usenname(driver).clear();
		obj.Usenname(driver).sendKeys("9030248855");
		

	}

}
