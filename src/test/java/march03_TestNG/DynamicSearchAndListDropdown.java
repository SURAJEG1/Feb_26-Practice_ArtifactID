package march03_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DynamicSearchAndListDropdown {


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
	public void dynamicDropdown_Example1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		Thread.sleep(2000);
		System.out.println(count);
		Thread.sleep(1000);
		dynamicList.get(5).click();
	}
	
	
	
	@Test(priority=2)
	public void dynamicDropdown_Example2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicList.size());
		
		Thread.sleep(2000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("under 20000 price")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
		
		
	}
	
	
	
	
	





	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
















}
