package framework.testng.data_provider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Reading_Input_From_DataProvider 
{
  @Test(dataProvider = "dp",enabled=false)
  public void f(Integer n, String s) 
  {
	  System.out.println(n+"   "+s);
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
  
  
  @Test(dataProvider="login_data",enabled=false)
  public void getUser_Data(String Name,String Mobile,String EmpID)
  {
	  System.out.println(Name+"    "+Mobile+"    "+EmpID);
  }
  
  
  
  
  @DataProvider  //Declare with static inorder to user outside class.
  public static Object[][] login_data() 
  {
    return new Object[][] 
    {
      new Object[] {"ajay", "9030","MQE001" },
      new Object[] {"akash","9040","MQE002" },
      new Object[] {"akil","9050","MQE003" },
      new Object[] {"amar","9060","MQE004" },
    };
  }
  
  
  
  @Test(dataProvider="product_info")
  public void get_product_details(String Productname,String ProductId)
  {
	  System.out.println(Productname+"     "+ProductId);
  }
  
  
  
  @DataProvider
  public String[][] product_info()
  {
	  
	  String product[][]=
		  {
				  {"pencil","1100234578"},
				  {"pen","76548734644"},
				  {"soap","8797878890"},
		  };
	  
	return product;
	  
  }
  
  
  
  
  
  
  
  
  
  
  
}
