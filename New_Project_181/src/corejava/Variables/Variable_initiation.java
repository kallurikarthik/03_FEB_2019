package corejava.Variables;

public class Variable_initiation {

	public static void main(String[] args) 
	{
		
		
		//Loal Initiation  [variable is not ovverride type]
		int a=10;
		System.out.println(a);
		
		
		//Global Initiation
		int b;
		b=100;
		System.out.println("b initial value  is => "+b);
		b=200;
		System.out.println("Bvalue override with => "+b);
		
		//Global Varable at Condition Class
		int m=0;  
		if(true)
		{
			m=10;
		}
		System.out.println("value is => "+m);
		
		
		//Global variable at Multiple Condition Classes
		int count=3;  
		boolean flag = false;
		if(count==0)
		{
			flag=true;
		}
		else if(count==1)
		{
			flag=false;
		}
		System.out.println("flag value is => "+flag);
		
		
		//Global variable at loop... 
		int sum=0;
		for (int i = 0; i < 10; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is => "+sum);
		
		
		/*
		 * If variable initilized inside loop or condition, It can acces
		 * only inside braces. to reutilize varaible outside we must initilize
		 * variable globally outside condition/ loop.
		 */
		
		
	}

}
