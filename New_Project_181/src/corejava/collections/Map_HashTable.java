package corejava.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Map_HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 * Map:-->
		 * 		Map is a interface class which store pair objects
		 * 		as collection. We store pair object using keyname
		 * 		and value.. 
		 * 
		 * 			=> Hashtable is sorter list of set..
		 * 			[Hashtable alos unorder collection of objects
		 * 				and doesn't accept duplicates...]
		 */
		
		
		Hashtable<Integer, String> map=new Hashtable<Integer,String>();
		map.put(1, "aakash");
		map.put(2, "sravan");
		map.put(3, "bhargav");
		map.put(4, "hima");
		
		
		
		//By using keyname retrieve keyvalue from hashtable
		String obj=map.get(2);
		System.out.println(obj);
		
		
		
		
		
		HashMap<String, Double> product=new HashMap<String,Double>();
		product.put("pen", 100.00);
		product.put("book", 200.00);
		product.put("pencil", 50.00);
		
	
		
		Double book_price=product.get("book");
		System.out.println(book_price);
		
		
		//Get Total price
		
		for (String EachItem :product.keySet()) 
		{
			Double price=product.get(EachItem);
			System.out.println(price);
		}
		
		
		
		product.clear();  //It clear all proudct info under hashmap..
		
		
		
	}

}
