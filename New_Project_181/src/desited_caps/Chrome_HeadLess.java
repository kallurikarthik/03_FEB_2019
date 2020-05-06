package desited_caps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_HeadLess {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		chromeOptions.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		
		
		
	}

}
