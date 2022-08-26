package org.com;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Test");
		String att = txtUserName.getAttribute("value");
		System.out.println(att);
		 		
}
}