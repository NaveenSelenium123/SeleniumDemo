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
		driver.get("https://www.facebook.com/");
		
		//Locating with text
		//WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//btnCreate.click();  ////a[contains(@data-testid,'registration')]
		
		//Locating with partial text using contains
		//WebElement btnCreate = driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		//btnCreate.click();
		
		//Locating with partial Attribute using contains
		WebElement btnCreate = driver.findElement(By.xpath("//a[contains(@data-testid,'registration')]"));
		btnCreate.click();
		
}
}