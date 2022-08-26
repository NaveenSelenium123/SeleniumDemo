package Data1HeaderStep;

import java.util.List;
import java.util.Map;

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
	@Given("User is on Facebook login page")
	public void user_is_on_Facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();     
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
		String object = (String) asMap.get("username");
		 WebElement txtEmail = driver.findElement(By.id("email"));
		    txtEmail.sendKeys(object);
		    String object2 = (String) asMap.get("password");
		    WebElement txtPass = driver.findElement(By.id("pass"));
		    txtPass.sendKeys(object2); 
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));   
		 btnLogin.click();     
	}

	@Then("Error page is displayed")
	public void error_page_is_displayed() {
		System.out.println("error page is displayed");  
	}



}
