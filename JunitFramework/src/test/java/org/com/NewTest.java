package org.com;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		//Assertion pass
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		Assert.assertTrue(contains);
		WebElement txtEmail= driver.findElement(By.id("email"));
		txtEmail.sendKeys("welcome");
		String attribute = txtEmail.getAttribute("value");
		//Assertion pass
		Assert.assertEquals("welcome", attribute);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("testing");

	}
}
