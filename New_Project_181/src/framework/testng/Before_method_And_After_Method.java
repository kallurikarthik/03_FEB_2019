package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_method_And_After_Method 
{
 
  @BeforeMethod   //Invoke every test before
  public void beforeMethod() 
  {
	  System.out.println("Test precondition");
  }

  @AfterMethod    //invoke every test after
  public void afterMethod() 
  {
	  System.out.println("Test postcondition"+"\n");
  }
  
  
  @Test(priority=0)
  public void tc001() 
  {
	  Reporter.log("tc001 executed",true);
  }
  
  @Test(priority=1)
  public void tc002() 
  {
	  Reporter.log("tc002 executed",true);
  }
  
  
  @Test(priority=2)
  public void tc003() 
  {
	  Reporter.log("tc003 executed",true);
  }


}
