package framework.testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 
{
	
	@Test(groups="G2")
	public void tc004()
	{
		Reporter.log("tcoo4 executed");
	}
	
	@Test(groups="G1")
	public void tc005()
	{
		Reporter.log("tcoo5 executed");
	}
	
	
	@Test(groups="G2")
	public void tc006()
	{
		Reporter.log("tcoo6 executed");
	}
 
}
