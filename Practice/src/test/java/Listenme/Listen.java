package Listenme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.CaptureShot;

public class Listen extends CaptureShot implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		TakeShot();
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("test started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("test is fineshed");
	}
	
	

}
