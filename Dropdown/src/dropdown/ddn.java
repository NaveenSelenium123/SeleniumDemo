package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement crt= driver.findElement(By.xpath("//a[text()='Create New Account']"));
	crt.click();
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.id("day"));
	Select s =new Select(day);
	s.selectByIndex(14);
	Thread.sleep(5000);
	s.selectByValue("7");
	Thread.sleep(5000);
	s.selectByVisibleText("24");
	
}
}
