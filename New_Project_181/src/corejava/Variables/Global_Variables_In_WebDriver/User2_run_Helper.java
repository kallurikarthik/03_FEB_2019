package corejava.Variables.Global_Variables_In_WebDriver;

public class User2_run_Helper {

	public static void main(String[] args) {
		
		//Create object for Helper
		Helper obj=new Helper();
		
		//Assing Runtime data to Chrome_driver_path and Application url
		obj.chrome_driver_path="D:\\sunill\\03rd-FEB_9-30AM\\03rd_FEB_2020_9-30AM\\New_Project_181\\Drivers\\chromedriver.exe";
		obj.Url="http://fb.com";
		obj.Launch_Browser();
		
		//Assing runtime username and password
		obj.Username="User2";
		obj.Password="Pwd3";
		obj.User_SignIn();
		
		
		


	}

}
