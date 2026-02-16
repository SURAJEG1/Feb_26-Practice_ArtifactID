package feb16_TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithDataProviderAnnotation {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		
	}
	
	
	
	@Test(dataProvider = "credentialDetails")
	public void loginTest001(String un, String pwd) 
	{
		
	}
	
	
	
	
	@DataProvider(name = "credentialDetails")
	public static Object[] dataDrivenWithDataProviderAnnotaion() 
	{
		Object[][] data = new Object[2][1];
		
		data[0][0] = "laptop";
		data[1][0] = "mobile";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
