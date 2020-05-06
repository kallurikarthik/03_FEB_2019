package corejava.Variables.Final_Keyword;


public class Exmp_Final 
{
	static int a=100;        //Accept Runtime chanages
	final static int b=200;  //Doesn't accept runtime changes
	

	public static void main(String[] args) 
	{
		System.out.println("a value before change is => "+a);
		//assing value to global variable at runtime
		a=200;
		System.out.println("a value after change is => "+a);
		
		
	
	}

}
