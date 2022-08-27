package org.dataforRunner;

import java.io.IOException;

import org.step.BaseClass;
import org.step.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionData extends BaseClass {
	@Given("User is on Facebook login page")
	public void user_is_on_Facebook_login_page() {
		browserConChrome();
		openApplication("https://www.facebook.com");
		maximizeWindow();   
	}

	@When("User enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() throws IOException {
		Login l =new Login();
        inputText(l.getTxtEmail(),excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\ZCucumberPOM\\ExcelData\\cucumber data.xlsx", "Sheet1", 1, 2));
        inputText(l.getTxtPass(),excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\ZCucumberPOM\\ExcelData\\cucumber data.xlsx", "Sheet1", 1, 3));
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		Login l =new Login();
		//l.getBtnLogin().click();
	}

	@Then("Error page is dispalyed")
	public void error_page_is_dispalyed() {
	   System.out.println("Error message is displayed---------------"); 
	}

}
