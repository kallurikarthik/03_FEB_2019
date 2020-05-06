package extent_reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Attach_ScreenShot_To_Report {

	public static void main(String[] args) throws Exception 
	{
		//Create HtmL Report file
				String File_path="reports\\OP4.html";
				ExtentReports reports=new ExtentReports(File_path, true);
				
						//Individual test report
						ExtentTest test=reports.startTest("Tc001_Valid_login");
								
							System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
							WebDriver driver=new ChromeDriver();
							test.log(LogStatus.INFO, "Browser launched");
							
							driver.get("http://facebook.com");
							test.log(LogStatus.INFO, "Application launched");
							
							String Scree_path="E:\\03rd_FEB_2020_9-30AM-master\\New_Project_181\\screens\\ExtentScreen.png";
							File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
							FileUtils.copyFile(src, new File(Scree_path));
							
							//Attach screen to test
							test.log(LogStatus.INFO, "Homescreen Captured",test.addScreenCapture(Scree_path));
							
								
						reports.endTest(test);
					
				reports.flush(); //It Create ouput file at location
				

	}

}
