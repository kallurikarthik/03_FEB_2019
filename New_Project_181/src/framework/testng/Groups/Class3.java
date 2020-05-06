package framework.testng.Groups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	@Test(groups="G1")
	public void tc007()
	{
		Assert.assertEquals("AA","BB");
		Reporter.log("tcoo7 exMQecuted");
	}
	
	@Test(groups="G3",dependsOnGroups="G1")
	public void tc008()
	{
		Reporter.log("tcoo8 executed");
	}
	
	
	@Test(groups="G3",dependsOnGroups="G1")
	public void tc009()
	{
		Reporter.log("tcoo9 executed");
	}
	
}
