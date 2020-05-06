package capture_Screen_Shot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_With_Time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://naukri.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		
		
		//Get System Default Date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert default date using simple dateformatter
		String time=sdf.format(d);
		
		
		//Capture screen anc convert into file format
		File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump screen into local utilities..
		FileUtils.copyFile(src_file, new File("screens\\"+time+"Aboutus.png"));

		
		
		
		
		

	}

}
