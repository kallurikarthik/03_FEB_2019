package corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Interface {

	public static void main(String[] args) 
	{
		
		
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("APPIUM");
		set.add("WD");
		set.add("CUKES");
		set.add("KATALON");
		
		
		//Get Size of objects
		int Count=set.size();
		System.out.println("Object Count is => "+Count);
		
		
		//Remove object form Collection
		set.remove("RC");
		
		
		//Verity object contains at collection
		boolean flag=set.contains("IDE");
		System.out.println("object available status is => "+flag);
		
		
		//Get next iterator of value
		String Itr=set.iterator().next();
		System.out.println("First iterator value is => "+Itr);
		
		
		//Verify Collection empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is => "+flag1);

		
		//Using foreach loop iterate collection of objects
		for (String Eachobj : set)
		{
			System.out.println("=> "+Eachobj);
		}
		
		
		//Example:--> Get all objects using while loop
		
		
		//Convert all collectin of objects into iterators
		Iterator<String> iterator=set.iterator();
		//Condition accept when iterator has next value 
		while(iterator.hasNext())
		{
			String object=iterator.next();
			System.out.println(">>.. "+object);
		}
		
		//Clear all objects at runtime
		set.clear();

		
		
		
	}

}
