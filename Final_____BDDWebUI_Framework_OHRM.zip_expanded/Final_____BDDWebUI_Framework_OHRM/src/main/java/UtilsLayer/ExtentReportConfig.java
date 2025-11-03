package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConfig {

	public static ExtentReports getConfig(String suiteName) {

		ExtentReports reports = new ExtentReports();

		String path = System.getProperty("user.dir") + "//ExtenReports//" + DateAndTime.getYear() + "//"
				+ DateAndTime.getMonthYear() + "//" + DateAndTime.getDateMonthYear() + "//" + suiteName
				+ DateAndTime.getDateMonthYearTime() + ".html";

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);

		reports.attachReporter(sparkReporter);

		return reports;
	}

}
