package stepdef;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends base.BaseClass {
	@Given("User is on Facebook login page")
	public void user_is_on_Facebook_login_page() {
	    
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> asMaps = dataTable.asMaps();
	   Map<String, String> map = asMaps.get(0);
	   String string = map.get("username");
	   WebElement txtEmail = locateById("email");
	   inputText(txtEmail,string);
	   Map<String, String> map2 = asMaps.get(0);
	   String string2 = map2.get("password");
	   WebElement txtPass = locateById("pass");
	   inputText(txtPass,string2);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}

	@Then("Error page is displayed")
	public void error_page_is_displayed() {
	   System.out.println("error page is displayed");
	}
}
