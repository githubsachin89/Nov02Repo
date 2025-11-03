package IHelper;

import org.openqa.selenium.WebElement;

public interface IElement {

	void click(WebElement wb);

	void submit(WebElement wb);

	void clear(WebElement wb);

	void sendKeys(WebElement wb, String value);

	String getText(WebElement wb);

	String getAttribute(WebElement wb, String key);

	String getCssValue(WebElement wb);

	boolean isDisplayed(WebElement wb);

	boolean isEnabled(WebElement wb);

	boolean isSelected(WebElement wb);

}
