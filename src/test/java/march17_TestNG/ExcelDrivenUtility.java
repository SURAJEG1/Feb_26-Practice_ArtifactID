package march17_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenUtility {
	
	
	public static Object [][] excelDriven(String filepath, String sheetname) throws IOException
	{
		//Step1 set file path and sheetname
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		//step2 create variable for Row and Column count
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		//step3 crate two dimensional array
		Object [][] data = new Object [rowCount-1][columnCount];
		
		//step4 crate for loop for tow and column data
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);
			//nested loop
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data [i-1][j] = cell.toString();
			}
		}
		
		//step5 close workbook and return data.
		workbook.close();
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
