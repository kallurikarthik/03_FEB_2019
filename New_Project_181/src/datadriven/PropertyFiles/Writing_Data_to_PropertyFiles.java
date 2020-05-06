package datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writing_Data_to_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object PropertyFiels
		Properties repository=new Properties();
		
		//Add objects to repository in key and value format
		repository.setProperty("Tc001", "TestPass");
		repository.setProperty("Tc002", "TestFail");
		repository.setProperty("Tc003", "TestPass");
		
		
		//Get Repository values into output files
		FileOutputStream fo=new FileOutputStream("src//datadriven//PropertyFiles//Output.properties");
		repository.store(fo, "Login Result");
		
		
	}

}
