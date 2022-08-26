package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement> iframecount =driver.findElements(By.tagName("iframe"));
		System.out.println("iframe count:" +iframecount.size());
		//switching to iframe
		driver.switchTo().frame("frame1");
		WebElement txt = driver.findElement(By.xpath("//body//input"));
		txt.sendKeys("A");
		// switching to inner frame
		driver.switchTo().frame(0);
		WebElement check= driver.findElement(By.id("a"));
		check.click();
		driver.switchTo().parentFrame();
		WebElement txt1 = driver.findElement(By.xpath("//body//input"));
		txt1.sendKeys("PYTHON");
		driver.switchTo().defaultContent();
		//find webelement in frame2 (index1)
		driver.switchTo().frame(1);
		WebElement ddn = driver.findElement(By.id("animals"));
		Select s =new Select(ddn);
		s.selectByIndex(3);
	}

}
