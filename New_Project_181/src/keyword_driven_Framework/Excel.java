package keyword_driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	
	static FileInputStream fi;
	static FileOutputStream fo;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static XSSFCell cell;
	static String filepath="E:\\03rd_FEB_2020_9-30AM-master\\New_Project_181\\src\\keyword_driven_Framework\\";
	
	
	/*
	 * Methodname:-->  Excel connecton with required sheet
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void excel_connection(String filename)
	{
		try {
			fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * Methodname:-->  Metho target sheet and return row count
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static int Get_Sheet_Row_Count(int SheetIndex)
	{
		sht=book.getSheetAt(SheetIndex);
		return sht.getLastRowNum();
	}
	
	
	
	
	/*
	 * Methodname:-->  Read Data from specific row and column
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static String getcellData(int sht_index, int row , int col)
	{
		sht=book.getSheetAt(sht_index);
		return sht.getRow(row).getCell(col).getStringCellValue();
		
	}
	
	
	/*
	 * Methodname:-->  Write cell data
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void writeCellData(int sht_index,int row, int col,String result)
	{
		sht=book.getSheetAt(sht_index);
		sht.getRow(row).createCell(col).setCellValue(result);
	}
	
	
	
	/*
	 * Methodname:-->  Create output file
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void Create_Excel_output(String output_filename)
	{
		try {
			book.write(new FileOutputStream(filepath+output_filename));
			book.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
