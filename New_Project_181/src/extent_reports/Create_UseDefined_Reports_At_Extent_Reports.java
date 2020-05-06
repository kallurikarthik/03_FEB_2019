package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Create_UseDefined_Reports_At_Extent_Reports {

	public static void main(String[] args) 
	{

		//Create HtmL Report file
		String File_path="reports\\OP3.html";
		ExtentReports reports=new ExtentReports(File_path, true);
		
				//Individual test report
				ExtentTest test=reports.startTest("Tc001_Valid_login");
						
						test.log(LogStatus.INFO, "Browser Launched");
						test.log(LogStatus.INFO, "Application Opened");
						test.log(LogStatus.PASS, "Login Valid Credentials Entered");
						test.log(LogStatus.INFO, "Logout successfull");
						test.log(LogStatus.INFO, "Browser Closed");
						
				reports.endTest(test);
			
		reports.flush(); //It Create ouput file at location
		
		
		
		
		
		
		
		
		

	}

}
