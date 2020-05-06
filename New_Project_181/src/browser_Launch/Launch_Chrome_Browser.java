package browser_Launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to launch chrome browser using webdriver
		 * 			we need to set environment variable for chromedriver.exe.
		 * 
		 * 		URL:-->  https://sites.google.com/a/chromium.org/chromedriver/
		 * 		=> Before download find chrome browser version and download
		 * 			chromedriver.exe file w.r.t chrome browser version.
		 * 		=> Click "ChromeDriver 80.0.3987.16"  link
		 * 		=> Select Operating system by click link [ChromeDriver 80.0.3987.16]
		 * 		=> Save File into backup driver
		 * 		=> Unzip file and move chromedriver.exe file to project location.
		 * 
		 */
		
		//set environment variabel before launch chrome browser..
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		 /*
		 * Exception:-->
		 * 			IllegalstateException
		 * 					=>Above exception display when Chromedriver.exe
		 * 					  file not create as system property.
		 * 		
		 * 			SessionNotCreate Exception
		 * 				   => When chromebrowser version and chromedriver.exe version 
		 * 					  mismatch then above exception will display.
		 * 
		 * 			InvalidArgumentException
		 * 				   => When protocal mismatch, We must
		 * 						use browser protocal [http:// or https://]
		 */
		
		
		
		
	}

}
