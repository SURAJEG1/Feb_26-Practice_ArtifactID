package feb28_TestNG;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class Facebook_Testcase extends BaseClass{
	
	
	@Test
	public void mouseHoverOnInstagramLinkAndRightClick() throws AWTException, InterruptedException 
	{
		driver.get(facebookUrl);
		Facebook_LoginPageObject rightclick = new Facebook_LoginPageObject(driver);
		rightclick.rightClickOnInstagram();
		robotClass();
		windowHandles();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
