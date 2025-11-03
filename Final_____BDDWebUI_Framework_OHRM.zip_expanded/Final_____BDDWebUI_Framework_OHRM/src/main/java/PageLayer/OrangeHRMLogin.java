package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseLayer.BaseClass;

public class OrangeHRMLogin extends BaseClass {


	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
		
	public OrangeHRMLogin() 
	{
		PageFactory.initElements(driver, this);
    }
	
	public void Login(String uname,String pass) {
		
		element.sendKeys(username, uname);
		element.sendKeys(password, pass);
		element.click(loginButton);
	}
}
