package march05_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDrivenUtility {

	public static Object[][] excelDriven(String filePath, String sheetName) throws IOException
	{

		//Step-1
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workBook = new XSSFWorkbook(fis);
		Sheet sheet = workBook.getSheet(sheetName);

		//Step-2
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();


		//Step-3
		String [][] data = new String [rowCount-1][columnCount];

		//Step-4 Apply nested loop 
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);

			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data [i-1][j] = cell.toString();
			}

		}

		//Close workBook.
		workBook.close();

		//return data variable
		return data;



	}























































}
