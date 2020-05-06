package interactions.Mouse;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Action_For_User_Login 
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");    
		//browser initiation command
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		
		
		//Move cursor location to email
		robot.mouseMove(546, 363);
		//Press Left click at mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Type Email
		String Email="sunilreddy.gajjala@outlook.com";
		String Password="Hello123456";
		
		
		//Get System clipboard
		Clipboard clipbord=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Select Email 
		StringSelection Semail=new StringSelection(Email);
		//Copy Email to Clipboard
		clipbord.setContents(Semail, Semail);
		
		
		//USE Cntrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		//Click Next button
		robot.mouseMove(805, 490);
		//Press Left click at mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		Thread.sleep(4000);

		
		//Copy password
		StringSelection Spwd=new StringSelection(Password);
		clipbord.setContents(Spwd, Spwd);
		
		
		//USE Cntrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		//Move cursor location to email
		robot.mouseMove(803, 510);
		//Press Left click at mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

	}

}
