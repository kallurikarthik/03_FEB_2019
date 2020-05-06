package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_Under_ExtentReports
{

	public static void main(String[] args)
	{
		
				//Create HtmL Report file
				String File_path="reports\\OP1.html";
				ExtentReports reports=new ExtentReports(File_path, true);
				
						//Individual test report
						ExtentTest test1=reports.startTest("Tc001_Valid_login");
						
								
						reports.endTest(test1);
						
						//Individual test report
						ExtentTest test2=reports.startTest("Tc002_InValid_login");
						
						
						reports.endTest(test2);
						
				
				
				reports.flush(); //It Create ouput file at location
				

	}

}
