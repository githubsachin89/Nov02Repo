package BaseLayer;

import org.openqa.selenium.WebDriver;

import UtilsLayer.ActionsUtils;
import UtilsLayer.DriverManager;
import UtilsLayer.DropdownUtils;
import UtilsLayer.ElementUtils;
import UtilsLayer.WebdriverUtils;

public class BaseClass {
	protected WebDriver  driver ;
	protected WebdriverUtils webdriver;
    protected ElementUtils element ;
    protected DropdownUtils dropDown ;
    protected ActionsUtils action;

	public BaseClass() {
		driver =DriverManager.getInstance().getDriver();
		
		 webdriver = new WebdriverUtils();
		 element = new ElementUtils();
		 dropDown = new DropdownUtils();
	    action = new ActionsUtils();
	}
}
