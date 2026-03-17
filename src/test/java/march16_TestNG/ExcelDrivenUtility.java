package march16_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenUtility {
	
	public static Object[][] excelDriven(String filepath, String sheetname) throws IOException
	{
		//Step-1, Set Filepath
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		//Step-2 Create variable for row and column
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		//Setp-3 create two dimensional array.
		Object [][] data = new Object [rowCount-1][columnCount];
		
		//Apply for loop
		for(int i=1; i<rowCount;  i++) 
		{
			Row row = sheet.getRow(i);
			
			//nested loop
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data [i-1][j] = cell.toString();
			}
		}
		
		//Setp-4 close workbook and return data
		workbook.close();
		return data;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
