package IHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropDown {

	void selectByVisibleText(WebElement wb, String physicalText);

	void selectByValue(WebElement wb, String value);

	void selectByIndex(WebElement wb, int index);

	void getOptions(WebElement wb);

	void selectValue(List<WebElement> listWb, String expectedValue);

}
