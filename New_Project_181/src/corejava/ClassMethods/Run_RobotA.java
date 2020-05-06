package corejava.ClassMethods;

public class Run_RobotA {

	public static void main(String[] args)
	{
		
		
		/*
		 * => Static is a access specifier it specifies
		 * 	  any static method or variable can call without
		 * 	  object creation..
		 *   Syntax to call static method from diff public class.
		 *   		Classname.methodname();
		 * 
		 */
		
		//Calling static methods from diff public class.
		RobotB.run();
		RobotB.walk();

	}

}
