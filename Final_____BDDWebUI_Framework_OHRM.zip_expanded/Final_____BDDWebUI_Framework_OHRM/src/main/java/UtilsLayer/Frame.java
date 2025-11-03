package UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import IHelper.IFrame;

public class Frame implements IFrame {

	private WaitUtils wait = new WaitUtils();
	WebDriver driver;

	public Frame() {
		driver = DriverManager.getInstance().getDriver();

	}

	@Override
	public void frame(String idOrName) {
		wait.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	@Override
	public void frame(int index) {

		wait.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	@Override
	public void frame(WebElement wb) {
		wait.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
	}

	@Override
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	@Override
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

}
