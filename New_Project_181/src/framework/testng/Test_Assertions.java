package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Assertions 
{
	
	
  @Test
  public void tc001() 
  {
	 Assert.assertEquals("MQ1", "MQ");  
	 Reporter.log("MQ match found");
  }
  
  @Test
  public void tc002() 
  {
	  Assert.assertTrue(true);
	  Reporter.log("Tc002 Executed successfull");
  }
  
  
  @Test
  public void tc003() 
  {
	  Assert.assertEquals("DSNR", "DSNR");
	  Reporter.log("Tc003 Execution successfull");
  }
  
  
}
