package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
 
  
  @BeforeClass   //Invoke before first @Test method
  public void beforeClass() 
  {
	  System.out.println("Preconditon for class");
  }

  @AfterClass    //Invoke after last @Test method
  public void afterClass() 
  {
	System.out.println("Post condition for class");  
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

}
