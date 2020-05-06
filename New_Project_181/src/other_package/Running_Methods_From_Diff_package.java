package other_package;

import corejava.ClassMethods.RobotB;
import corejava.instantmethods.RobotA;

public class Running_Methods_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * => Inorder to call method or variable from different
		 * 	  package we should declare method name with <<"public">>
		 * 	  modifier
		 * 
		 * => we should import other package into current class
		 */
		
		//Instant method calling
		new RobotA().walk();
		new RobotA().run();
		
		//Class Method calling
		RobotB.run();
	}

}
