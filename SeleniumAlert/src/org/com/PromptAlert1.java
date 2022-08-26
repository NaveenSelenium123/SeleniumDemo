package org.com;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement InkOk = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		InkOk.click();
		Thread.sleep(3000);
		WebElement btnButton = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		btnButton.click();
		Alert a =driver.switchTo().alert();
		a.sendKeys("Naveen");
		a.accept();
}
}