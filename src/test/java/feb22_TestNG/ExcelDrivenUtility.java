package feb22_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenUtility {

	public static Object[] excelDriven(String filepath, String sheetname) throws IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCoount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][columnCoount];
		for(int i=1; i<rowCount; i++) 
		{
			Row row =  sheet.getRow(i);
			
			for(int j=0; j<columnCoount; j++) 
			{
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.toString();
			}
		}
		workbook.close();
		return data;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
