package oops.Encapsulation;

public class Run_UserData 
{

	public static void main(String[] args) 
	{
		
		//create object for class
		UserData obj=new UserData();
		
		//We can change public variable at runtime[There is chance to misusage data]
		String New_ID=obj.empid="MQE003";
		System.out.println("Updated Employee Id is => "+New_ID);
		
		
		//Initiate value to variable
		obj.set_name("Vijay");
		obj.set_email("vijay_krishna@gmail.com");
		obj.set_mobile("9030248855");
		
		
		//Initlize variable value to method
		String New_name=obj.get_name();
		System.out.println("User name is = "+New_name);
		
		String New_email=obj.get_email();
		System.out.println("User email is => "+New_email);
		
		String New_Mobile=obj.get_mobile();
		System.out.println("user mobile is => "+New_Mobile);

	}

}
