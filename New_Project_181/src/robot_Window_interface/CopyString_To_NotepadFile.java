package robot_Window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString_To_NotepadFile {

	public static void main(String[] args) throws Exception 
	{
		//Launch Notepad file at runtime.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Store path into reference variable
		String text="selenium is webinterface automation tool";
				
		
		//Select String...
		StringSelection Stext=new StringSelection(text);
		//Get Current System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set all selected content into clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Ctrl+V shortcut 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release down key Control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Control+S..  [This command try to save notepad file]
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		
		
		String path="E:\\03rd_FEB_2020_9-30AM-master\\New_Project_181\\src\\robot_Window_interface\\Robot_File.txt";
		//Select Path using Selection String
		StringSelection Selected_Path=new StringSelection(path);
		//Set Content to clipboard at runtime
		clipboard.setContents(Selected_Path, Selected_Path);
		
		
		//Press Ctrl+V shortcut 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release down key Control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
