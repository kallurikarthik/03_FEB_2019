package corejava.ClassMethods;

public class RobotB 
{
	
	
	public static void walk()
	{
		System.out.println("walk executed");
	}
	
	public static void run()
	{
		System.out.println("run executed");
	}
	
	
	/*
	 * => Static is a access specifier it specifies
	 * 	  any static method or variable can call without
	 * 	  object creation..
	 */
	

	public static void main(String[] args) 
	{
		//Call static specifier methods
		walk();
		run();

	}

}
