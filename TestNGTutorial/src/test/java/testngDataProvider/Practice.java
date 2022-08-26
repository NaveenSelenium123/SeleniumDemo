package testngDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
WebDriver driver;
	
	@BeforeMethod
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
	}
	@AfterMethod
	public void afterClass() {
		driver.close();
	}
	
	@Test(dataProvider="sampleData")
	public  void tc(String email,String pass) {
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(email);
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(pass);
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	}
	
	@DataProvider(name="sampleData")
	public Object[][] data(){
		return new Object[][] {
		{"user1","Test123"},
		{"user2","Test546"},
		{"user3","Test789"},
		{"user4","Testing"}		
		};
	}
}
