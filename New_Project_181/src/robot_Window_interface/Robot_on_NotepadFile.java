package robot_Window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_on_NotepadFile {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		
		//Launch Notepad file at runtime.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object fo Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Using Robot Class type Hello mindq text into Notepad file
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_Q);
	
		
		
		

	}

}
