package datadriven.Csv_Files;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Write_Data_into_Csv_Files {

	public static void main(String[] args) throws Exception
	{
		
		//Create csv file
		FileWriter fw=new FileWriter("src//datadriven//Csv_Files//Output.csv");
		System.out.println("File created");
		
		
		//Create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
		
		String Header[]= {"Product","price"};
		writer.writeNext(Header);
		
		String Rec1[]= {"Pen","50"};
		writer.writeNext(Rec1);
		
		String Rec2[]= {"Pencel","15"};
		writer.writeNext(Rec2);
		
		writer.close();  //Save all data to writer file
		
		
		
		
		
		
		
		
		
		
		

	}

}
