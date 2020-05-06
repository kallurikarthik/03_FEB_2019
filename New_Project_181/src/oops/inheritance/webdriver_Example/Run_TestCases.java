package oops.inheritance.webdriver_Example;

import org.junit.Test;

public class Run_TestCases extends TestCases
{

	@Test  //Invoke method to run without object creation
	public void Verify_FlighSearch()
	{
		Tc001_Setup_browser();
		Tc002_FlightSearch();
		driver.close();  //Driver receive from parent class..
	}
}
