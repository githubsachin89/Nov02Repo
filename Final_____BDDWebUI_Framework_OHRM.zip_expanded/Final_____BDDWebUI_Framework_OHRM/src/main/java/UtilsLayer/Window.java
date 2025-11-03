package UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import IHelper.IWindow;


public class Window implements IWindow {
	WebDriver driver;

	public Window() {
		driver = DriverManager.getInstance().getDriver();
	}

	@Override
	public void selectWindow(Set<String> allWindow, int windowIndex) {

		ArrayList<String> allArrayWindow = new ArrayList<String>();
		Iterator<String> it = allWindow.iterator();
		
		while (it.hasNext()) {
			allArrayWindow.add(it.next());
		}
		driver.switchTo().window(allArrayWindow.get(windowIndex));

	}

}
