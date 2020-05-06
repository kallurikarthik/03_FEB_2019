package framework.testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1
{
	@Test(groups={"G1","G3"})
	public void tc001()
	{
		Reporter.log("tcoo1 executed");
	}
	
	@Test(groups="G2")
	public void tc002()
	{
		Reporter.log("tcoo2 executed");
	}
	
	
	@Test(groups="G1")
	public void tc003()
	{
		Reporter.log("tcoo3 executed");
	}

}
