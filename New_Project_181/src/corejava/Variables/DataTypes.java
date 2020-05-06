package corejava.Variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		/*
		 * int:--> is a Numeric Datatype Accept only numbes to store
		 * 			And default value of is  [0] -zero
		 * 			
		 */
		
		 int a=100000;
		 int b=200000;
		 int c=a+b;
		 
		 System.out.println("sum value is => "+c);
		 
		 
		 /*
		  * long:--> is a Numeric Datatype Accept only numbes to store
		  * 			And default value of is  [0] -zero
		  * 		=> We follow long whenever morethan integer value 
		  * 			to store.
		  * 			
		  */
		 
		 
		 /*
		  * boolean:-->
		  * 		boolean accept true/false values to store,
		  * 		And boolean default value is false.
		  */
		 boolean flag=true;
		 System.out.println("flag value is => "+flag);
		 
		 
		 /*
		  * Double:-->
		  * 		Double accept decimal values to store.
		  * 		Default value is null.
		  */
		 double val=10002.123545;
		 System.out.println("value is => "+val);
		 
		 /*
		  * float:-->
		  * 		float store decimal value, We should
		  * 		apped f at end of the datatype, Otherwise
		  * 		it consider as double.
		  */
		 float fvalue=100.2f;
		 float Svalue=200.2f;
		 float mvalue=fvalue/Svalue;
		 System.out.println("total float value is => "+mvalue);
		 
		 /*
		  * Char:--> Any single characters to store
		  * 		Single characters should define under single codes..
		  */
		 char group='A';
		 System.out.println("Single characters is => "+group);
		 
		 
		 /*
		  * String:-->
		  * 		String is a non-primitive datatype and it
		  * 		accept set of characters to store.
		  * 		=> default value of string is null.
		  */
		 String name="MQ-Dsnr";
		 String email="info.dsnr@mindqsystems.com";
		 String mobile="9030248855";
		 
		 System.out.println(name+"   "+email+"   "+mobile);
		 
		

	}

}
