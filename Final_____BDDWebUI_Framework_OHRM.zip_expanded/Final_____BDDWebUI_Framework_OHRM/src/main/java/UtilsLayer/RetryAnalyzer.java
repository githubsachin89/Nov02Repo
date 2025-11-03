package UtilsLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0;

	int maxCounter = 4;

	@Override
	public boolean retry(ITestResult result) {

		if (counter < maxCounter) {
			counter++;

			return true;
		}
		return false;
	}

}
