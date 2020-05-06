package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//IDentifying sensex tab
		WebElement SenSex_TAB=driver.findElement(By.id("InvestRec"));
		
		//Get Object Coordinates at webpage
		Point Obj_point=SenSex_TAB.getLocation();
		
		//Using object point get x and y coordinates
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		
		System.out.println("Object x coordinates are => "+obj_x);
		System.out.println("Object y coordinates are => "+obj_y);
		
		
		
		//Verify Element visibility using coordinates..
		if(obj_x > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("Object hidden at webpage");
		
		
		
		
		
		

	}

}
