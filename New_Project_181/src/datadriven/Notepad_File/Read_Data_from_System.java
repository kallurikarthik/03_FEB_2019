package datadriven.Notepad_File;

import java.util.Scanner;

public class Read_Data_from_System {

	public static void main(String[] args) 
	{
		//Create object for Scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:--> ");
		String UID=sc.nextLine();
		System.out.println("Username is => "+UID);
		
		
		System.out.println("Enter Age:-->");
		int Age=sc.nextInt();
		System.out.println("Age is => "+Age);
		
		
		System.out.println("Enter Start iteration number:--> ");
		int start=sc.nextInt();
		
		System.out.println("Enter End iteration number:--> ");
		int End=sc.nextInt();
		
		for (int i = start; i <= End; i++) 
		{
			System.out.println(i);
		}
		
		
	}

}
