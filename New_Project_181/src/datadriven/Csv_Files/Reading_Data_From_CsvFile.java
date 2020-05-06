package datadriven.Csv_Files;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Reading_Data_From_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file using filereader
		FileReader fr=new FileReader("src//datadriven//Csv_Files//Input.csv");
		System.out.println("file located");
		
		
		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		//Read first record
		String Header[]=reader.readNext();
		System.out.println(Header[0]+"   "+Header[1]);
		
		//Read next Record
		String line1[]=reader.readNext();
		System.out.println(line1[0]+"   "+line1[1]);
		
		//Read next Record
		String line2[]=reader.readNext();
		System.out.println(line2[0]+"   "+line2[1]);
		
		//Read all records under csv file using Conditional loop
		String line[];
		while((line=reader.readNext())!=null)
		{
			System.out.println(line[0]+"    "+line[1]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
