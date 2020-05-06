package datadriven.Csv_Files;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Write_All_DataTo_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		//Create csv file
		FileWriter fw=new FileWriter("src//datadriven//Csv_Files//Output.csv");
		System.out.println("File created");
		
		
		//Create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
		
		
		List<String[]> data=new ArrayList<String[]>();
		data.add(new String[] {"username","email","mobile"});
		data.add(new String[] {"rajesh","raj@gmail.com","9030929922"});
		data.add(new String[] {"suresh","suri@gmail.com","9034929922"});
		data.add(new String[] {"mahesh","mahi@gmail.com","9030923434"});
		
		writer.writeAll(data);
		
		writer.close();
		
		

	}

}
