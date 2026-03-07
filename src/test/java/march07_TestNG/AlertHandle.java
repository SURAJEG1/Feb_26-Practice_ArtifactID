package march07_TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class AlertHandle {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	public void alertHandle() 
	{
		//Accept Alert (Click OK)
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//Dismiss Alert (Click Cancel)
		alert.dismiss();
		
		//Get Alert Text
		String text = alert.getText();
		System.out.println(text);
		
		//Send Text to Prompt Alert
		alert.sendKeys("Suraj");
		alert.accept();
	}
	
	@Test
	public void handleAlertDismiss() throws InterruptedException 
	{
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		button.click();
		
		Thread.sleep(3000);
		//Accept Alert (Click OK)
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
	}
	
	

	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
