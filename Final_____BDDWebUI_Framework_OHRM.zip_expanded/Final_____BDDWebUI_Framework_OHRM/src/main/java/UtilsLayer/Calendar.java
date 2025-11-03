package UtilsLayer;

import java.util.List;


import org.openqa.selenium.WebElement;

import IHelper.ICalendar;


public class Calendar implements ICalendar {

	private ElementUtils element = new ElementUtils();
	private WaitUtils wait = new WaitUtils();
	@Override
	public void selectMonthAndYear(WebElement monthAndYear, WebElement next, String expectedMonthYear) {
		while (true) {
			String actualMonthYear = element.getText(monthAndYear);

			if (actualMonthYear.equalsIgnoreCase(expectedMonthYear)) {
				break;
			} else {
				element.click(next);
			}
		}
		
	}
	@Override
	public void selectDate(List<WebElement> listDate, String expectedDate) {
		for (WebElement value : wait.visibilityOfAllElements(listDate)) {
			if (value.getText().equals(expectedDate)) {
				value.click();
				break;
			}
		}
		
	}

	

}
