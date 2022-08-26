package org.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnRemove = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnRemove.click();
		WebElement mousehover= driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		Actions a =new Actions(driver);
		a.moveToElement(mousehover).perform();
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Women Western']"));
		a.moveToElement(mouseHover).perform();
		
}
}