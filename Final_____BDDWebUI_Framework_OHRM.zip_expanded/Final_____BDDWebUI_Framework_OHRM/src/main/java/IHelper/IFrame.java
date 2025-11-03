package IHelper;

import org.openqa.selenium.WebElement;

public interface IFrame {

	void frame(String idOrName);

	void frame(int index);

	void frame(WebElement wb);

	void parentFrame();

	void defaultContent();

}
