package corejava.method_behaviour;

public class RobotC 
{
	//method with parameter
	public void walk(int km)
	{
		System.out.println(km);
	}
	
	//emthod with return type
	public int getspeed()
	{
		return 10;
	}
	

	public static void main(String[] args) 
	{
	
		RobotC obj=new RobotC();
		obj.walk(5);  //Calling method with 5 integer argument
		obj.walk(10);  //Calling method with 10 integer argument
		
		int speed=obj.getspeed();
		System.out.println("Robot speed return as => "+speed);
	}

}
