package org.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexPositions {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(3000);
		WebElement txtPass = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[4]"));
		txtPass.sendKeys("test");
}
}