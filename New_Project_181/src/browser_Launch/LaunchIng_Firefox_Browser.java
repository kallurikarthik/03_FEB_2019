package browser_Launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchIng_Firefox_Browser {

	public static void main(String[] args)
	{
		
		/*
		 * URL:L--> https://github.com/mozilla/geckodriver/releases
		 * 			Select any release w.r.t firefox browser version
		 * 			Geckodriver version => v0.26.0
		 * 			Firefox browser version => 60 >
		 * 			=> download geckodriver <"geckodriver-v0.26.0-win64.zip"> for windows
		 * 			=> Save File into backup driver
		 * 		    => Unzip file and move geckodriver.exe file to project location.
		 */
		 System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		 FirefoxDriver firefox=new FirefoxDriver();
		 firefox.get("http://facebook.com");
		 
		 
		 
		 /*
			 * Exception:-->
			 * 			IllegalstateException
			 * 					=>Above exception display when Chromedriver.exe
			 * 					  file not create as system property.
			 * 		
			 * 			SessionNotCreate Exception
			 * 				   => When firefoxbrowser version and geckodriver.exe version 
			 * 					  mismatch then above exception will display.
			 * 
			 * 			InvalidArgumentException
			 * 				   => When protocal mismatch, We must
			 * 						use browser protocal [http:// or https://]
			 */
	}

}
