package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement txtEmail= driver.findElement(By.id("email"));
		 txtEmail.sendKeys("welcome");
		 WebElement txtPassword= driver.findElement(By.id("pass"));
		 txtPassword.sendKeys("hello");
		 WebElement btnLogin= driver.findElement(By.name("login"));
		 btnLogin.click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 driver.manage().window().maximize();
		 driver.close();
	}

}
