package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.io.FileHandler;

public class Reading_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException
	{
		
		
		//Using fileinputstream file location of Property file
		FileInputStream fi=new FileInputStream("src//datadriven//PropertyFiles//Input.properties");
		System.out.println("File located");
		
		//Create object for propertyfiles
		Properties repository=new Properties();
		
		//Load input data to repository
		repository.load(fi);
		
		//Read value from property files
		String url=repository.getProperty("facebook.url");
		System.out.println(url);
		
		//Read value from property files
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		
		

	}

}
