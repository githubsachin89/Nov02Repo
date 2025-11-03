package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener implements ITestListener {
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		reports = ExtentReportConfig.getConfig(context.getSuite().getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());

		test.addScreenCaptureFromPath(
				new CaptureScreenshot().takeFullScreenshot("PassScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());

		test.addScreenCaptureFromPath(
				new CaptureScreenshot().takeFullScreenshot("FailScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
