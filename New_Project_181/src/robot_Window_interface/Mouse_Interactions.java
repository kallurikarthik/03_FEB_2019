package robot_Window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Interactions {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);	
		
		
		
		//create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		robot.mouseMove(305, 165);
		
		//Press Left click at mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		
		/*
		 * Download Mouse Position tool
		 * 		
		 * 		=> https://www.adminsehow.com/2012/03/realtime-mouse-position-monitor-tool/
		 */
		
		
		//Scroll Down
		robot.mouseWheel(100);

		
		//Scroll up
		robot.mouseWheel(-100);
		
		
		/*
		 * FAQ:--> Did selenium support scroll down browser window..
		 * 		Ans:--> NO,
		 */
		
		
		
	}

}


