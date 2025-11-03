package UtilsLayer;

import org.openqa.selenium.WebElement;

import IHelper.IElement;

public class ElementUtils implements IElement {
	
	private WaitUtils wait = new WaitUtils();

	@Override
	public void click(WebElement wb) {
		wait.elementToBeClickable(wb).click();		
	}

	@Override
	public void submit(WebElement wb) {
		wait.elementToBeClickable(wb).submit();	
	}

	@Override
	public void clear(WebElement wb) {
		wait.visibilityOf(wb).clear();	
	}

	@Override
	public void sendKeys(WebElement wb, String value) {
		
		wait.visibilityOf(wb).sendKeys(value);
	}

	@Override
	public String getText(WebElement wb) {
		
		return wait.visibilityOf(wb).getText();
	}

	@Override
	public String getAttribute(WebElement wb, String key) {
		
		return wait.visibilityOf(wb).getAttribute("value");	
	}

	@Override
	public String getCssValue(WebElement wb) {
		
		return wait.visibilityOf(wb).getCssValue("backgroundcolor");
	}

	@Override
	public boolean isDisplayed(WebElement wb) {
		
		return wait.visibilityOf(wb).isDisplayed();
	}

	@Override
	public boolean isEnabled(WebElement wb) {
		
		return wait.visibilityOf(wb).isEnabled();
	}

	@Override
	public boolean isSelected(WebElement wb) {
		
		return wait.visibilityOf(wb).isSelected();
	}

}
