package IHelper;

import org.openqa.selenium.WebElement;

public interface IJavascriptExecutor {

	void click(WebElement wb);

	void sendKeys(WebElement wb, String value);

	void scrollIntoView(WebElement wb);

	// remaining js methods

}
