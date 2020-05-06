package corejava.Loops;

import java.util.HashSet;
import java.util.Set;

public class ForEach {

	public static void main(String[] args)
	{
		
		
		
		/*
		 * Example:--> Read Array next values.
		 */
		String toolname[]= {"IDE","RC","WD","GRID","Appium"};
		
		//Iterate for number of array items
		for (String eachtool : toolname)   //Eachtool is userdefined...
		{
			System.out.println(eachtool);
		}
		
		
		/*
		 * Example:--> Read Array next value
		 */
		int num[]= {100,200,300,400,500};
		
		//Iterate for number of array items
		for (int i : num)    //i is a userdefined variable
		{
			System.out.println(i);
		}
		
		
		/*
		 * Read Collection Next values
		 */
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		//Read collection next value using foreach 
		for (String eachobj : set) 
		{
			System.out.println("=> "+eachobj);
		}
		
		
	
		
		

	}

}
