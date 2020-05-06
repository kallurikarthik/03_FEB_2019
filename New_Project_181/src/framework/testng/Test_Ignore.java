package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Ignore 
{
	
	
	@Test
	public void tc001()
	{
		Reporter.log("tc001 Executed");
	}
	
	@Test(enabled=false)
	public void tc002()
	{
		Reporter.log("tc002 Executed");
	}

	
	@Test
	public void tc003()
	{
		Reporter.log("tc003 Executed");
	}


}
