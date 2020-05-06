package method_parameters;

public class Method_Parameter 
{
	
	
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";   //Value is hardcoded..
		System.out.println(name);
	}
	
	
	//Method with parameter
	public void print_tool(String toolname)     //Functional parameter receive input, while method invoke.
	{
		String name=toolname;
		System.out.println(name);
	}
	

	public static void main(String[] args) 
	{
		
		//Create object for class
		Method_Parameter obj=new Method_Parameter();
		obj.print_tool();
		
		//calling method with actual parameter
		obj.print_tool("IDE");
		obj.print_tool("WD");
		obj.print_tool("GRID");
		
	}

}
