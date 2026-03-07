package march07_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenUtility {
	
	
	public static Object[][] excelDrivenUtility(String filePath, String sheetName) throws IOException
	{
		//Step-1
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		
		//Step-2
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		//Step-3
		Object [][] data = new Object [rowCount-1][columnCount];
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);
			//Nested loop
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data [i-1][j] = cell.toString();
			}
		}
		
		//Step-4
		workbook.close();
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
