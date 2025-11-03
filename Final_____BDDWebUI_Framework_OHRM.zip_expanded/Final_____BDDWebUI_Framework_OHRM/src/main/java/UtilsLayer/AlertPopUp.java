package UtilsLayer;

import IHelper.IAlert;

public class AlertPopUp implements IAlert {

	private WaitUtils wait = new WaitUtils();

	@Override
	public void accept() {
		wait.alertIsPresent().accept();
	}

	@Override
	public String getText() {
		return wait.alertIsPresent().getText();
	}

	@Override
	public void dismiss() {
		wait.alertIsPresent().dismiss();
		
	}

	@Override
	public void sendKeys(String value) {
		wait.alertIsPresent().sendKeys(value);
		
	}

}
