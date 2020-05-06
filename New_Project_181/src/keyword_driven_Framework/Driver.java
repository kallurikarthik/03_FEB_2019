package keyword_driven_Framework;

import org.openqa.selenium.By;

public class Driver 
{
  
	public static void main(String args[])
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.set_timeout(30);
		
		
		Excel.excel_connection("KWD.xlsx");
		
		//Get Number of rows data available at Excel.
		int Row_Count=Excel.Get_Sheet_Row_Count(0);
		
		//Apply for loop to iterate until last row of sheet
		for (int i = 1; i <= Row_Count; i++) 
		{
			
			String Lname=Excel.getcellData(0, i, 1);
			String Lvalue=Excel.getcellData(0, i, 2);
			String Keyword=Excel.getcellData(0, i, 3);
			String InputData=Excel.getcellData(0, i, 4);
			
			/*
			 * Get Locatorname and Locatorvalue from excel with in string format
			 * and covert Locatorname and Locator value into By class format.
			 */
			By Default_locator=Locator.convert_locator(Lname, Lvalue);
			
			
			switch (Keyword) 
			{
			case "open_application":
				obj.load_webpage(InputData);
				break;
				
			case "enter_text":
				obj.Enter_text(Default_locator, InputData);;
				break;
				
			case "select_dropdown":
				obj.Select_dropdown(Default_locator, InputData);
				break;
				
			case "click_element":
				obj.Click_element(Default_locator);
				break;
				
			case "switchto_window":
				obj.switchto_window(InputData);
				break;
				
			case "mouse_hover":
				obj.MouseHover(Default_locator);
				break;
				
			case "Verify_title":
				obj.is_title_presented(InputData);
				break;
				
			case "CaptureScreen":
				obj.Capturescreen(InputData);
				break;
				
			case "Alert_Close":
				obj.CloseAlert();
				break;
				
			default:
				break;
			}
			
		}
		
		
		
		
		
		
	}
	
	
 }


