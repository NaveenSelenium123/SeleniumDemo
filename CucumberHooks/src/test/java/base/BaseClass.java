package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public static WebDriver driver; 
	public static void browserConChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
public  void openApplication(String url) {
	driver.get(url);
}
public  void maximizeWindow() {
	driver.manage().window().maximize();
}
public  void inputText(WebElement element,String value) {
	element.sendKeys(value);
}

public   void click(WebElement element) {
	element.click();
}
public WebElement locateById(String id) {
	WebElement findElement= driver.findElement(By.id(id));
	return findElement;
}
public WebElement locateByName(String name) {
WebElement findElement = driver.findElement(By.name(name));
return findElement;
}
public void closeBrowser() {
	driver.close();

}

}
