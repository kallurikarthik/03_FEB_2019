package capture_Screen_Shot;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_On_Alert_using_Robot_Class {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		
		//IDentify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		Search_btn.click();
		
		
		
		//Get screen dimension at runtime
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
	
		//Create object for robot class
		Robot robot=new Robot();
		//Createscreen
		BufferedImage image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
		//Destinaton file
		File Dfile=new File("screens\\image1.png");
		//Write Image into local files
		ImageIO.write(image, "PNG", Dfile);
		
		
		

	}

}
