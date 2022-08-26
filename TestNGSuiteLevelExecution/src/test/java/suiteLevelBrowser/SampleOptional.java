package suiteLevelBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleOptional {
	@Parameters({"mail","pass"})
	@Test
	public void tc1(@Optional("xyx@gmail.com")String email,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
        txtPass.sendKeys(pass);
        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();
	}

}
