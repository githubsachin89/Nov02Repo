package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimClick;

	@FindBy(xpath = "//a[text()='Add Employee']")
	WebElement addEmpClick;

	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "middleName")
	WebElement middlename;

	@FindBy(name = "lastName")
	WebElement lastname;

//	@FindBy(xpath = "//label[text()='Employee Id']/parent::div/following-sibling::div/input")
//	WebElement employeeId;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;

//	//get emp id by getAttribute

//	
//	//nationality
//	@FindBy(xpath="//label[text()='Nationality']/parent::div/following-sibling::div")
//	WebElement nationality;
//	
//	@FindBys(@FindBy(xpath="//div[@role='listbox']/div"))
//	List<WebElement> Listnationality ;
//	
//	//radio button
//	@FindBys(@FindBy(xpath="//div[@class='--gender-grouped-field']/div"))
//	List<WebElement> RadioButtonList ;
//	
//	@FindBy(xpath="//p[text()=' * Required']/following-sibling::button")
//	WebElement addEmpsaveButton ;
//	
//	//click on  Employeee list
//	@FindBy(xpath="//a[text()='Employee List']")
//	WebElement empList;

	// enter emp id
//	@FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div/input")
//	WebElement addEmpId;
//	
//	//click on search button
//	@FindBy(xpath="//button[text()=' Search ']")
//	WebElement searchButton;
//	
//	
//	@FindBy(xpath="//div[@role='columnheader']/child::div[@class='oxd-checkbox-wrapper']")
//	WebElement idCheckBox;
//	
//	
//	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
//	WebElement deleteEMp;
//	
//	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
//	WebElement yesDelete;

	public PIMPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnPimLink() {
		element.click(pimClick);
	
	}
	
	public void clickOnAddEmp() {
		element.click(addEmpClick);
	}

	public void addEmployee(String fname, String mname, String lname) {

		element.sendKeys(firstname, fname);
		element.sendKeys(middlename, mname);
		element.sendKeys(lastname, lname);

	}

	
	public void clearandsave() throws InterruptedException {
//		element.clear(employeeId);
//		element.sendKeys(employeeId, empid);
		element.click(saveButton);
		Thread.sleep(2000);
	}

}