package march09_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void dynamicSearchAndListDropdownExample1() throws InterruptedException 
	{
		WebElement pop = driver.findElement(By.xpath("//span[@role='button']"));
		pop.click();
		Thread.sleep(4000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchBox.sendKeys("laptop");
		
		List<WebElement> list = driver.findElements(By.xpath("//form[@class='_Bidnv header-form-search XN_jdV']/ul/li"));
		int count = list.size();
		System.out.println(count);
		Thread.sleep(2000);
		list.get(2).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
