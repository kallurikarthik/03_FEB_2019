package framework.testng.data_provider;

import org.testng.annotations.Test;

public class Read_dataprovider_Data_from_different_Class {

	
	/*
	 * Note:--> Inorder to use dataprovider data in different class, we should write dataprovider
	 * 			classname along with dataprovider method name.
	 * 
	 * 		=> Declare dataprovider annotation with static access specifier..
	 */
	
	 @Test(dataProvider="login_data",dataProviderClass=Reading_Input_From_DataProvider.class)
	 public void getUser_Data(String Name,String Mobile,String EmpID)
	 {
		  System.out.println(Name+"    "+Mobile+"    "+EmpID);
	 }
}
