package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import IHelper.IDropDown;

public class DropdownUtils implements IDropDown {

	private WaitUtils wait = new WaitUtils();

	private Select getSelect(WebElement wb) {
		return new Select(wait.visibilityOf(wb));
	}

	@Override
	public void selectByVisibleText(WebElement wb, String physicalText) {

		getSelect(wb).selectByVisibleText(physicalText);
	}

	@Override
	public void selectByValue(WebElement wb, String value) {
		getSelect(wb).selectByValue(value);
	}

	@Override
	public void selectByIndex(WebElement wb, int index) {
		getSelect(wb).selectByIndex(index);

	}

	@Override
	public void getOptions(WebElement wb) {

		List<WebElement> listValue = getSelect(wb).getOptions();

		for (WebElement value : listValue) {
			System.out.println(value.getText());
		}
	}

	@Override
	public void selectValue(List<WebElement> listWb, String expectedValue) {

		for (WebElement value : wait.visibilityOfAllElements(listWb)) {
			if (value.getText().equalsIgnoreCase(expectedValue)) {
				value.click();
				break;
			}
		}

	}


}
