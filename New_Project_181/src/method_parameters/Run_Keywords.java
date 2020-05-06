package method_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Run_Keywords 
{
	
	 @FindBy(xpath = "//input[@name='reg_email__']")
	 static WebElement Mobile_OR_Email;
	 
	 @FindBy(xpath = "//select[@name='birthday_year']")
	 static WebElement Year_Dropdown; 

	public static void main(String[] args)
	{
		
		
		//Crete object for keywords class
		Keywords obj=new Keywords();
		obj.Launch_Browser("chrome");
		obj.Launch_App("http://facebook.com");
		obj.time(40);
		
		//Invoke method with Xpath Identifier
		obj.Enter_text("//input[@id='email']", "903024885");
		obj.Enter_text("//input[@name='pass']", "Hello12345");
	
		
		//Invoke method with Different Locator Identifiers
		obj.Enter_text(By.id("u_0_m"), "Archana");
		obj.Enter_text(By.name("lastname"), "Kiran");
		
		
		//Invoke method with POM object
		Run_Keywords objs=PageFactory.initElements(obj.driver, Run_Keywords.class);
		obj.Enter_text(objs.Mobile_OR_Email, "info.Dsnr@gmail.com");
		
		
		//Select Dropdown using xpath
		obj.select_dropdown("//select[@id='day']", "21");
		//Select Dropdown using CssSelector
		obj.select_dropdown(By.cssSelector("#month"), "May");
		
		//Select Dropdown using Pageobject model
		obj.select_dropdown(objs.Year_Dropdown, "1990");
		
		
		//Select Checkbox
		obj.click_element("//input[@value='1']");
		
		
	}

}
