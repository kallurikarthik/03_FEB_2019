package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Array_List {

	public static void main(String[] args) 
	{
		
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("APPIUM");
		list.add("WD");
		list.add("CUKES");
		list.add("KATALON");
		
		
		
		//retrieving single object using index number [only available at list interface]
		String second_obj=list.get(2);
		System.out.println("Second index object is => "+second_obj);
		
		//Get Size of objects
		int Count=list.size();
		System.out.println("Object Count is => "+Count);
		
		
		//Remove object form Collection
		list.remove("RC");
		
		
		//Verity object contains at collection
		boolean flag=list.contains("IDE");
		System.out.println("object available status is => "+flag);
		
		
		//Get next iterator of value
		String Itr=list.iterator().next();
		System.out.println("First iterator value is => "+Itr);
		
		
		//Verify Collection empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is => "+flag1);

		
		//Using foreach loop iterate collection of objects
		for (String Eachobj : list)
		{
			System.out.println("=> "+Eachobj);
		}
		
		
		//Example:--> Get all objects using while loop
		
		
		//Convert all collectin of objects into iterators
		Iterator<String> iterator=list.iterator();
		//Condition accept when iterator has next value 
		while(iterator.hasNext())
		{
			String object=iterator.next();
			System.out.println(">>.. "+object);
		}
		
		
		
		//Using for loop iterator for number of objects
		for (int i = 0; i < list.size(); i++) 
		{
			//Find each object at collection using "get" Keyword
			String obj_name=list.get(i);
			System.out.println(obj_name);
		}
		
		
		
		
		
		
		
		
		//Clear all objects at runtime
		list.clear();

	}

}
