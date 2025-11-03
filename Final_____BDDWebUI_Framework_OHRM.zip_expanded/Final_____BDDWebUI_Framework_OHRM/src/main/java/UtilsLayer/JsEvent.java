package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import IHelper.IJavascriptExecutor;

public class JsEvent implements IJavascriptExecutor {

	private WaitUtils wait = new WaitUtils();
	private WebDriver driver;

	public JsEvent() {
		driver = DriverManager.getInstance().getDriver();
	}

	@Override
	public void click(WebElement wb) {

		((JavascriptExecutor) driver).executeScript("arguments[0]click()", wait.elementToBeClickable(wb));
	}

	@Override
	public void sendKeys(WebElement wb, String value) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "'", wait.visibilityOf(wb));
	}

	@Override
	public void scrollIntoView(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", wait.visibilityOf(wb));
	}

}
