package method_parameters;

public class Polymorphism_Overloading 
{
	
	/*
	 * => Polymorphism is one of OOPS feature
	 * => Polymorphism means many form or directions.
	 * => Using polymorphism we can execute same program with many forms.
	 * => Polymorphism available in two types 
	 *			1. Method overloading
	 *			2. Method overriding
	 *
	 *Overloading:-->
	 *		=> Creating methods with different functional parameters.
	 *
	 */
	
	
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";   //Value is hardcoded..
		System.out.println(name);
	}
	
	
	//Method with parameter
	public void print_tool(String toolname)     //Functional parameter receive input, while method invoke.
	{
		String name=toolname+" WebDriver";
		System.out.println(name);
	}
		
	
	public void print_tool(String toolname, double price)
	{
		System.out.println(toolname+"   => "+price);
	}
	

	public static void main(String[] args) 
	{
		//Create object for class
		Polymorphism_Overloading obj;
		obj=new Polymorphism_Overloading();
		
		//Calling method without any actual arguments
		obj.print_tool();
		
		//Calling method with single argument
		obj.print_tool("Selenium");
		
		//Calling method with multiple aruments
		obj.print_tool("Webdrvier", 1000.00);
		
		

	}

}
