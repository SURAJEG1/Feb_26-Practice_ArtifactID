package march31_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + ": Successfully Executed");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + ": Got failed & Screenshot Captured");
		result.getThrowable();
	}
	
	
	
	
	
	
	
	
	
	
	

}
