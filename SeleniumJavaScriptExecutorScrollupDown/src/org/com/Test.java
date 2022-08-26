package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	driver.get("https://www.amazon.in/");
	WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	//jk.executeScript("arguments[0].scrollIntoView(true)",down);
	Thread.sleep(3000);
	WebElement up = driver.findElement(By.xpath("(//a[text()='See all deals'])[1]"));
	//jk.executeScript("arguments[0].scrollIntoView(false)",up);
	jk.executeScript("arguments[0].scrollIntoView(true)",down,up);
	jk.executeScript("arguments[1].scrollIntoView(true)",down,up);
	
}
}