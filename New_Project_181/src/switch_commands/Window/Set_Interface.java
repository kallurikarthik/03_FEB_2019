package switch_commands.Window;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface 
{
	
	public static void main(String args[])
	{
		
		/*
		 * Set is a collection framework and  it is a interface
		 * class.
		 * => Set is a unorder collection of objects and doesn't
		 * 		duplicate values to store..
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("Appium");
		set.add("Cucumber");
		set.add("WebDriver");
		set.add("GRID");
		set.add("IDE");
		set.add("WebDriver");
		
		System.out.println("Object Count at collections =>  "+set.size());
		
		
		//Apply Foreach loop to iterate Collection of objects
		for (String Eachobject : set) 
		{
			System.out.println(Eachobject);
		}
		
		//Convert set Interaface into Iterators
		Iterator<String> itr=set.iterator();
		
		//Then next iterator object we can read with Next method.
		String one=itr.next();
		System.out.println(one);
		
		String two=itr.next();
		System.out.println(two);
		
	}

}
