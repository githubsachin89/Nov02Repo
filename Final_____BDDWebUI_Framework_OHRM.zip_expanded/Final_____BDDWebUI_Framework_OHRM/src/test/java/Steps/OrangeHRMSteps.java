package Steps;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import BaseLayer.BaseClass;
import BaseLayer.BaseTest;
import PageLayer.OrangeHRMLogin;
import PageLayer.PIMPage;
import UtilsLayer.ExcelReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OrangeHRMSteps extends BaseClass {

	LinkedHashMap<String, String> testData;
	static OrangeHRMLogin login;
	static PIMPage pim;

	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException 
	{
		BaseTest.setUp("chrome");
    }
    @When("user enter username and password and click on loginBtn")
	public void user_enter_username_and_password_and_click_on_login_btn(DataTable dataTable) {
		login = new OrangeHRMLogin();

		List<List<String>> listValue = dataTable.asLists();
		String Uname = listValue.get(0).get(0);
		String Pname = listValue.get(0).get(1);
		login.Login(Uname, Pname);
     }

	@Then("click on pim link")
	public void click_on_pim_link() {
		pim = new PIMPage();
		pim.clickOnPimLink();
	}

	@When("click on addEmployee")
	public void click_on_add_employee() {
		pim.clickOnAddEmp();
	}

	@When("user capture test data from from {string} with {int}")
	public void user_capture_test_data_from_from_with(String Excelsheet, Integer RowNumber) throws Exception {
		testData = ExcelReader.readTestData(Excelsheet).get(RowNumber);
	}

	@Given("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String firstname, String middlename, String lastname) {

		String fname = testData.get(firstname);
		String mname = testData.get(middlename);
		String lname = testData.get(lastname);

		pim.addEmployee(fname, mname, lname);
	}

	@When("user click on savebtn")
	public void user_click_on_savebtn() throws InterruptedException {
		pim.clearandsave();
    }

	@AfterAll
	public static void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		BaseTest.tearDown();
		
	}
}
