package IHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ICalendar {

	void selectMonthAndYear(WebElement monthAndYear, WebElement next, String expectedMonthYear);

	void selectDate(List<WebElement> listDate, String expectedDate);

}
