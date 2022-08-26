package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User is an facebook login page")
	public void user_is_an_facebook_login_page() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	  WebElement txtEmail = driver.findElement(By.id("email")); 
	  txtEmail.sendKeys(string);
	  WebElement txtPass = driver.findElement(By.id("pass"));
	  txtPass.sendKeys(string2);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   WebElement btnLogin = driver.findElement(By.name("login"));
	   btnLogin.click();
	}

	@Then("Error page is displayed")
	public void error_page_is_displayed() {
	   System.out.println("Error Page is Displayed---------------"); 
	}



}
