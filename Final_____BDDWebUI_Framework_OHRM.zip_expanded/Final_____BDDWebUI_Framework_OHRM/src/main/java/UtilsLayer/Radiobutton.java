package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import IHelper.IRadioButton;

public class Radiobutton implements IRadioButton {

	private WaitUtils wait = new WaitUtils();

	@Override
	public void selectRadioBtn(List<WebElement> listRadio,String expectedValue) {

		for (WebElement value : wait.visibilityOfAllElements(listRadio)) {
			if (value.getText().equalsIgnoreCase(expectedValue)) {
				value.click();
				break;
			}
		}

	}
}
