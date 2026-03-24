package march24_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ " " + ": Successfully Executed...");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " " + ": Got failed & Screenshot captured...");
		System.out.println(result.getThrowable());
		
	}

	
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " " + ": Test started...");
	}

}
