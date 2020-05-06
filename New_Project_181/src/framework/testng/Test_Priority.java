package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Priority 
{
  @Test(priority=0)
  public void f() 
  {
	  Reporter.log("f method executed");
  }
  
  @Test(priority=1)
  public void z() 
  {
	  Reporter.log("z method executed");
  }
  
  @Test(priority=2)
  public void a() 
  {
	  Reporter.log("a method executed");
  }
}
