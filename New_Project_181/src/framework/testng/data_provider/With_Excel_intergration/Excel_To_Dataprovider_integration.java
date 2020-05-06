package framework.testng.data_provider.With_Excel_intergration;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_To_Dataprovider_integration 
{
	
	String filepath="TestData\\InputData.xlsx";
	XSSFWorkbook book;
	XSSFSheet sht;
	
	
	
	@Test(dataProvider="Excel_Data")
	public void get_user_Data(String name,String EmpId,String Mobile)
	{
		System.out.println(name+"   "+EmpId+"   "+Mobile);
	}
	
	

	@BeforeClass
	public void precondition() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet1");
	}
	

	
	@DataProvider
	public  String[][] Excel_Data()
	{
		
		int rcount=sht.getLastRowNum();
		int ccount=sht.getRow(0).getLastCellNum();
		
		String data[][];
		data=new String[rcount+1][ccount];
		
		//Iterate for number of rows
		for (int i = 0; i <= rcount; i++) 
		{
			//Innerloop to iterate number of cells
			for (int j = 0; j < ccount; j++) 
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
			
		return data;
		
	}
	
	
	
	
	
	
	

	
	
	
	
	

}
