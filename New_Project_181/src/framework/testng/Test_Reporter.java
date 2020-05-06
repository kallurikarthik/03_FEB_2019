package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Reporter 
{
	
	@Test
	public void tc001()
	{
		Reporter.log("Tc001 Executed");   //Make report at Emailable Report..
	}
	
	@Test
	public void tc002()
	{
		Reporter.log("Tc002 Executed",true);
		//It make report at emailablereport and Console..
	}

}
