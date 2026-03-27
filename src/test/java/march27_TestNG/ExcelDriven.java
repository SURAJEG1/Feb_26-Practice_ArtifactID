package march27_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class ExcelDriven {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "items")
	public void searchProd(String prod) 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys(prod);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	@DataProvider(name = "items")
	public Object[][] dataDriven() throws IOException
	{
		String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\ItemDetails.xlsx";
		String sheetName = "items";
		
		return ExcelDriven.excelDrivenUtility(filePath, sheetName);
	}
	
	
	@AfterMethod
	public void TearDown() 
	{
		driver.quit();
	}
	
	
	
	
	public static Object[][] excelDrivenUtility(String filepath, String sheetname) throws IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][columnCount];
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);
			
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.toString();
			}
			
		}
		workbook.close();
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
