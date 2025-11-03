package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import UtilsLayer.DriverManager;
import UtilsLayer.PropertyReader;
import UtilsLayer.WebdriverUtils;

public class BaseTest {

	public static void setUp(String driverName) throws IOException {
		DriverManager.getInstance().setDriver(driverName);
		
		WebdriverUtils webDriver = new WebdriverUtils();
		
		webDriver.get(PropertyReader.getProperty("URL"));
		webDriver.maximize();
		webDriver.implicitlyWait(Duration.ofSeconds(30));
		webDriver.pageLoadTimeout(Duration.ofSeconds(30));
		//webDriver.deleteAllCookies();
	}
	
	public static void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		new WebdriverUtils().quit();
	}
}
