package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import IHelper.IWait;

public class WaitUtils implements IWait {

	private WebDriver driver;

	public WaitUtils() {
		driver = DriverManager.getInstance().getDriver();
	}
	

	public WebDriverWait getWait() {
		return new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@Override
	public WebElement visibilityOf(WebElement wb) {
		return getWait().until(ExpectedConditions.visibilityOf(wb));
	}

	@Override
	public List<WebElement> visibilityOfAllElements(List<WebElement> listWb) {

		return getWait().until(ExpectedConditions.visibilityOfAllElements(listWb));
	}

	@Override
	public WebElement elementToBeClickable(WebElement wb) {
		return getWait().until(ExpectedConditions.elementToBeClickable(wb));
	}

	@Override
	public Alert alertIsPresent() {
		return getWait().until(ExpectedConditions.alertIsPresent());
	}

	
}
