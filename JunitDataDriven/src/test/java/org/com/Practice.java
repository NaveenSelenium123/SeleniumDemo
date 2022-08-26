package org.com;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Practice extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserConChrome();
		openApplication("http://www.facebook.com");
		maximizeWindow();
		
	}
	@AfterClass
	public static void afterClass()  {
		browserClose();	

	}
	@Before
	public void beforeEachMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void afterEachMethod() {
		Date d=new Date();
		System.out.println(d);	

	}
	@Test
	public void tc1() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("welcome");
		WebElement txtPass= driver.findElement(By.id("pass"));
		txtPass.sendKeys("testing");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
