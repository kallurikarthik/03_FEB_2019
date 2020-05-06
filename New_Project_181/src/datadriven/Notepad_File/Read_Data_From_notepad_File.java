package datadriven.Notepad_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_notepad_File {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileReader fr=new FileReader("src//datadriven//Notepad_File//InputData.txt");
		System.out.println("File located");
		
		
		//Create object fo buffered reader..
		BufferedReader reader=new BufferedReader(fr);
		
		//Read header line
		String Header=reader.readLine();
		String Head[]=Header.split(",");
		System.out.println(Head[0]+"    "+Head[1]);
		
		
		//Read first line
		String Line1=reader.readLine();
		String L1[]=Line1.split(",");
		System.out.println(L1[0]+"   "+L1[1]);
		
		
		//Read all lines under noteapad file using conditional loop
		String rline;
		while((rline=reader.readLine())!=null)
		{
			String Line[]=rline.split(",");
			System.out.println(Line[0]+"   "+Line[1]);
			
		}
		

	}

}
