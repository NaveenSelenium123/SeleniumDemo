package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor jk =(JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/login/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value','Naveen')",txtUserName);
		Thread.sleep(3000);
		WebElement txtPass = driver.findElement(By.id("pass"));
		Object a = jk.executeScript("return arguments[0].getAttribute('value')",txtUserName);
		System.out.println(a);
		String s=(String) a;
		System.out.println(a);
WebElement btnLogin = driver.findElement(By.name("login"));	
jk.executeScript("arguments[0].click()", btnLogin);
}
}