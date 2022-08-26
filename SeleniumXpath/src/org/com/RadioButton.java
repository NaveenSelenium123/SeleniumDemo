package org.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement btnMale = driver.findElement(By.xpath("//input[@value='Male']"));
		btnMale.click();
		WebElement btnCricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		btnCricket.click();
}
}