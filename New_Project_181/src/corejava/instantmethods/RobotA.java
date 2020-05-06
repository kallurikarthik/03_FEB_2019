package corejava.instantmethods;

public class RobotA 
{
	//Instant method
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	//Instant method
	public void run()
	{
		System.out.println("run executed");	
	}

	//main method
	public static void main(String[] args) 
	{
		/*
		 * Instant method calling from static method
		 * Syntax:-->
		 * 			new Classname().methodname();
		 */
		
		new RobotA().walk();
		new RobotA().run();
	}

}
