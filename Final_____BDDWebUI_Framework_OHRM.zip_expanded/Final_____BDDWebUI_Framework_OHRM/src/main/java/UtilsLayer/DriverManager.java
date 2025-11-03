package UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	private DriverManager() {
	}

	public static DriverManager getInstance() {
		return new DriverManager();
	}

	public static void setDriver(String driverName) {
		WebDriver driver = null;

		if (driverName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\allDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (driverName.equalsIgnoreCase("incognito")) {

			driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		} else if (driverName.equalsIgnoreCase("headless")) {
			driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		} else {
			System.out.println("Please Enter valid Driver Name");
		}
		td.set(driver);
	}

	public WebDriver getDriver() {
		return td.get();
	}

}
