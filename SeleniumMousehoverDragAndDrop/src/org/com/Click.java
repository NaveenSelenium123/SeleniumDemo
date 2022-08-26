package org.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("test");
		Actions a =new Actions(driver);
		a.doubleClick(txtUserName).perform();
		a.contextClick(txtUserName).perform();
		
}
}