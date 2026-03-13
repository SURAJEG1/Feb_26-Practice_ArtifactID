package march13_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class TC004_DynamicSearchAndListDropdown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void tc001_dynamicSearchAndListDropdownClick() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("led tv");
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = list.size();
		Thread.sleep(2000);
		System.out.println(count);
		Thread.sleep(1000);
		list.get(4).click();
		Thread.sleep(2000);
	}
	
	
	
	
	@Test(priority=2)
	public void tc002_dynamicSearchAndListDropdownClick() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("led tv");
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(list.size());
		
		Thread.sleep(2000);
		for(int i=0; i<=list.size(); i++) 
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("43 + inch 4k")) 
			{
				list.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
