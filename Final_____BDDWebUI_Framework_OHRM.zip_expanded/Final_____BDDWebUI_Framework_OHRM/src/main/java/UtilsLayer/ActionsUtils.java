package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import IHelper.IActions;
import io.reactivex.rxjava3.functions.Action;

public class ActionsUtils implements IActions{
	private WaitUtils wait=new WaitUtils();
	private WebDriver driver;
	
	public ActionsUtils()
	{
		driver=DriverManager.getInstance().getDriver();
	}
	public  Actions getActions()
	{
		return new Actions(driver);
	}
	
	@Override
	public void click(WebElement wb) {
		
		getActions().click(wait.elementToBeClickable(wb)).perform();
	}

	@Override
	public void sendKeys(WebElement wb, String value) {
		getActions().sendKeys(wait.visibilityOf(wb), value);
		
	}
	@Override
	public void doubleClick(WebElement wb) {
		getActions().doubleClick(wait.elementToBeClickable(wb)).perform();		
	}

	@Override
	public void contextClick(WebElement wb) {
		getActions().contextClick(wait.elementToBeClickable(wb)).perform();		
	}

	@Override
	public void moveToElement(WebElement wb) {
		getActions().moveToElement(wait.visibilityOf(wb)).perform();		
	}

	@Override
	public void scrollToElement(WebElement wb) {
		getActions().scrollToElement(wait.visibilityOf(wb)).perform();
	}

	@Override
	public void dragAndDrop(WebElement source, WebElement dest) {
		getActions().dragAndDrop(wait.visibilityOf(source), wait.visibilityOf(dest)).perform();		
	}

	@Override
	public void clickAndHold(WebElement wb) {
		getActions().clickAndHold(wait.elementToBeClickable(wb)).perform();
	}

	@Override
	public void release(WebElement wb) {
		getActions().release().perform();		
	}

	@Override
	public void keyUp(Keys keys) {
		getActions().keyUp(keys).perform();		
	}

	@Override
	public void keyDown(Keys keys) {
		getActions().keyDown(keys).perform();
		
	}
	
	
	
	

}
