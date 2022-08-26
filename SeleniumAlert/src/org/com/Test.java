package org.com;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement InkOk = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		InkOk.click();
		WebElement btnButton = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btnButton.click();
		Alert a =driver.switchTo().alert();
		a.accept();
}
}