package org.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Window {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\RedBusLogin\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String pri= driver.getWindowHandle();
	System.out.println(pri);
	WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
	src.sendKeys("iphone",Keys.ENTER);
	
	System.out.println(driver.getWindowHandle());
	WebElement lnk1= driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - Purple']"));
	 lnk1.click();
	 Set<String> allwin = driver.getWindowHandles();
	 for (String string : allwin) {
		 if(!string.equals(pri)) {
		 driver.switchTo().window(string);
	}
	 }
	 System.out.println("After switching");
	 Thread.sleep(4000);
	 System.out.println(driver.getWindowHandle());
	 WebElement add = driver.findElement(By.id("add-to-cart-button"));
	 add.click();
	System.out.println("multiple window task--2"); 
	 driver.switchTo().window(pri);//
	 
	 WebElement lnk2= driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Green']"));
	 lnk2.click();
	 //switching to 3 window
	 Set<String> allwin2 = driver.getWindowHandles();
	 System.out.println(allwin2);
	 List<String> l =new ArrayList<String>();
	 l.addAll(allwin2);
	 for (int i = 0; i < l.size(); i++) {
		 String string = l.get(2);
		 driver.switchTo().window(string);	
	}
	 WebElement add1= driver.findElement(By.id("add-to-cart-button"));
	 add1.click();	 
}
}
