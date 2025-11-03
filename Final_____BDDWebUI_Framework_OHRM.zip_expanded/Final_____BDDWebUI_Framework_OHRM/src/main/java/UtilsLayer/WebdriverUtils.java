package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import IHelper.IWebDriver;

public class WebdriverUtils implements IWebDriver{

	private WebDriver driver;
	
	public WebdriverUtils() {
		driver =DriverManager.getInstance().getDriver();
	}
	
	@Override
	public void get(String url) {
		driver.get(url);	
	}

	@Override
	public void to(String url) {
		driver.navigate().to(url);		
	}

	@Override
	public void refresh() {
		driver.navigate().refresh();		
	}

	@Override
	public void forward() {
		driver.navigate().forward();		
	}

	@Override
	public void back() {
		
		driver.navigate().back();
	}

	@Override
	public String getTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}

	@Override
	public void quit() {
		
		driver.quit();		
	}

	@Override
	public void close() {
		
		driver.close();
	}

	@Override
	public void maximize() {
		driver.manage().window().maximize();		
	}

	@Override
	public void minimize() {
		
		driver.manage().window().minimize();
	}

	@Override
	public void fullscreen() {
		driver.manage().window().fullscreen();		
	}

	@Override
	public void implicitlyWait(Duration duration) {
		driver.manage().timeouts().implicitlyWait(duration);		
	}

	@Override
	public void pageLoadTimeout(Duration duration) {
		
		driver.manage().timeouts().pageLoadTimeout(duration);
	}

	@Override
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();		
	}

}
