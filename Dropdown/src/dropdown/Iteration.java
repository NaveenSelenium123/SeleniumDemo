package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iteration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement crt= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		crt.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select s =new Select(day);
		List<WebElement> all = s.getOptions();
		int size = all.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement opt = all.get(i);
			String text = opt.getText();
			System.out.println(text);
			System.out.println(all.get(i).getText());	
		}
		System.out.println("==============================");
		for (WebElement x : all) {
			String attribute = x.getAttribute("value");
			System.out.println(attribute);
			System.out.println(x.getAttribute("value"));
			
		}
}
}