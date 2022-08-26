package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForLoop {
	public static void main(String[] args) throws IOException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("test");
		Actions a =new Actions(driver);
		a.doubleClick(txtUserName).perform();
		a.contextClick(txtUserName).perform();
		Robot r =new Robot();
		for (int i = 0; i < 8; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
}
}