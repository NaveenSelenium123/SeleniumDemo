package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File f =new File("D:\\PRACTICE\\selenium git\\facebook.jpg");
		FileUtils.copyFile(screenshotAs, f);
		
	}

}
