package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args) 
	{
		
		
		//Create HtmL Report file
		String File_path="reports\\OP.html";
		ExtentReports reports=new ExtentReports(File_path, true);
		
		reports.flush(); //It Create ouput file at location
		
		

	}

}
