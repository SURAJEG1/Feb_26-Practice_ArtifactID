package march30_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	WebDriver driver;

	//constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy (id = "") WebElement id;
	@FindBy (className = "") WebElement className;
	@FindBy (name = "") WebElement name;
	@FindBy (linkText = "") WebElement linkText;
	@FindBy (partialLinkText = "") WebElement partialLinkText;
	@FindBy (tagName = "") WebElement tagName;
	@FindBy (css = "") WebElement css;
	@FindBy (xpath = "") WebElement xpath;
	
	
	public void id() 
	{
		id.sendKeys("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
