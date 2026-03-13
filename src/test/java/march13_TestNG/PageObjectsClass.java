package march13_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsClass {
	//Create object of  WebDrivr;
	WebDriver driver;
	//Constructor
	public PageObjectsClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (xpath = "") WebElement action;
	
	
	
	public void action() 
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
