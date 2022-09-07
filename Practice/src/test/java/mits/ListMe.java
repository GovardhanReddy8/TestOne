package mits;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.CapMe;

public class ListMe extends CapMe implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("the test is successfill"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed "+result.getMethod().getMethodName());
		TakeCapture();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped because reason "+result.getMethod().getMethodName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test is started succssfully "+context.getName());
	}
	
	

}
