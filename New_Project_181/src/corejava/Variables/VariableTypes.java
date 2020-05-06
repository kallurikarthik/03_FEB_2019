package corejava.Variables;

public class VariableTypes 
{
	
	int x=100;           //Instant Variable
	static int y=200;    //Class Variable
	final int z=300;     // Global variable with final keyword
	//[Final keyword doesn't accept any runtime changes]
	
	public void method1()
	{
		int a=400;        //Local variable..
		System.out.println("Local variable => "+a);
	}
	
	public void method2()
	{
		System.out.println("Instant variable => "+x);
		System.out.println("Class variable => "+y);
	}
	
	public static void main(String[] args) 
	{
		//Get Instant Variable 
		int val=new VariableTypes().x;
		System.out.println("Instant variable value is => "+val);
		
		//Get Static Variable with In Class
		int val1=y;
		System.out.println("Class variable value is => "+val1);
		
		//Get Static Varaible from diff class
		int Val2=VariableTypes.y;
		System.out.println("Class Variable from diff_class => "+Val2);
		
		//calling Instant method
		VariableTypes obj=new VariableTypes();
		obj.method1();
		obj.method2();

	}

}
