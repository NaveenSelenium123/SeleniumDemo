package org.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User is on Facebook login page")
	public void user_is_on_Facebook_login_page() {
	 WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
	 driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		 //driver = new EdgeDriver();
		//driver =new 
	 driver.get("https://www.facebook.com");
	}

	@When("User enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
	   WebElement txtEmail = driver.findElement(By.id("email"));
	   txtEmail.sendKeys("Welcome");
	   WebElement txtPass = driver.findElement(By.id("pass"));
	   txtPass.sendKeys("Testing");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	}

	@Then("Error page is dispalyed")
	public void error_page_is_dispalyed() {  
	}
}
