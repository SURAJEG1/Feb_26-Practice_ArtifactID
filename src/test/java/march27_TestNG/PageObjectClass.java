package march27_TestNG;

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
	
	
	
	
	@FindBy (id = "") WebElement userName;
	@FindBy (name ="") WebElement userPassword;
	@FindBy (className = "") WebElement userEmailID;
	@FindBy (linkText = "") WebElement userPhoneNo;
	@FindBy (partialLinkText = "") WebElement userRole;
	@FindBy (css = "") WebElement userEmpId;
	@FindBy (xpath = "") WebElement clickOnReg;
	@FindBy (tagName = "") WebElement clickOnLogin;
	
	
	
	public void username(String un) 
	{
		userName.sendKeys(un);
	}
	
	public void userpassword(String pwd) 
	{
		userPassword.sendKeys(pwd);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
