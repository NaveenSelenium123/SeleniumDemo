package org.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		WebElement lnkForget = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		lnkForget.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
}
}