package march21_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_PageObject {
	//Create object of WebDriver;
	WebDriver driver;
	
	//Constructor
	public Registration_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "") WebElement firstName;
	@FindBy (id = "") WebElement lastName;
	@FindBy (id = "") WebElement emailId;
	@FindBy (id = "") WebElement password;
	
	
	public void firstNameOfUser(String fName) 
	{
		firstName.sendKeys(fName);
	}
	
	public void lastNameOfUser(String lName) 
	{
		lastName.sendKeys(lName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
