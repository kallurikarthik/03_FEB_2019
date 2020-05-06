package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Sub_Test_Under_MainTest {

	public static void main(String[] args) 
	{
		
		//Create HtmL Report file
		String File_path="reports\\OP2.html";
		ExtentReports reports=new ExtentReports(File_path, true);
		
				//Creating MainTest
				ExtentTest MainTest=reports.startTest("User_login");
				
				reports.endTest(MainTest);

				//Individual test report
				ExtentTest test1=reports.startTest("Tc001_Valid_login");
				
						
				reports.endTest(test1);
				
				//Individual test report
				ExtentTest test2=reports.startTest("Tc002_InValid_login");
				
				
				reports.endTest(test2);
				
				
				//Appending child test to main test
				MainTest.appendChild(test1).appendChild(test2);
		
		
		reports.flush(); //It Create ouput file at location

	}

}
