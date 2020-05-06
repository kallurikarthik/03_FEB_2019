package corejava.Variables.Global_Variables_In_WebDriver;

public class User1_Run_Helper
{

	public static void main(String[] args) 
	{
		
		//Create object for Helper
		Helper obj=new Helper();
		
		//Assing Runtime data to Chrome_driver_path and Application url
		obj.chrome_driver_path="Drivers\\chromedriver.exe";
		obj.Url="http://facebook.com";
		obj.Launch_Browser();
		
		//Assing runtime username and password
		obj.Username="User1";
		obj.Password="Pwd1";
		obj.User_SignIn();

	}

}
