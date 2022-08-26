package org.com;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\projects\\SeleniumBrowserLaunch\\driver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Test");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		 		
}
}
