package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement ddn= driver.findElement(By.id("fruits"));
		Select s =new Select(ddn);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(3);
		Thread.sleep(5000);
		s.selectByValue("banana");
		Thread.sleep(5000);
		s.selectByVisibleText("Orange");
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement x : all) {
			String text = x.getText();
			System.out.println(text);
			//WebElement first = s.getFirstSelectedOption();
			//String text2 = first.getText();
			//System.out.println("first" +text2);
			s.deselectByValue("grape");
			Thread.sleep(5000);
			s.deselectByIndex(2);
			Thread.sleep(5000);
			s.deselectByVisibleText("Banana");
			List<WebElement> options = s.getOptions();
			for (WebElement y : options) {
				String text3 = y.getText();
				s.selectByVisibleText(text3);
				Thread.sleep(5000);	
			}
			Thread.sleep(5000);
			s.deselectAll();
		}
		
}
}