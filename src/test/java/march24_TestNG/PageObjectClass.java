package march24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	
	WebDriver driver;
	
	//Constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (name = "") WebElement nameField;
	
	@FindBy (className = "") WebElement lastNameField;
	
	@FindBy (id = "") WebElement emailField;
	
	@FindBy (tagName = "") WebElement setPassword;
	
	@FindBy (linkText = "")WebElement clickOnRegisterLink;
	
	@FindBy (partialLinkText = "") WebElement submit;
	
	@FindBy (css = "") WebElement lgButton;
	
	@FindBy (xpath = "") WebElement setUsername;
	
	
	
	
	public void enterName(String name) 
	{
		nameField.sendKeys(name);
	}
	
	
	public void enterLastName(String lastname) 
	{
		lastNameField.sendKeys(lastname);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
