package org.adactin;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPom {
	public static WebDriver driver; 
	public static void browserConChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
public static void openApplication(String url) {
	driver.get(url);
}
public static void maximizeWindow() {
	driver.manage().window().maximize();
}
public static void navigateBack() {
	driver.navigate().back();

}
public static void navigateForward() {
	driver.navigate().forward();
}
public static  void refresh() {
	
driver.navigate().refresh();
}
public static void inputText(WebElement element,String value) {
	element.sendKeys(value);
}

public static  void click(WebElement element) {
	element.click();
}
public static void dropdown(WebElement element,int value) {
	Select s =new Select(element);
	s.selectByIndex(value);	
}
public static void scrollUp(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	jk.executeScript("arguments[0].scrollIntoView(true)", element);

}
public static void scrollDown(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	jk.executeScript("arguments[0].scrollIntoView(false)", element);
}
public static  void jkClick(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	jk.executeScript("arguments[0].click()", element);
	}
public static  String jsGetText(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	Object t = jk.executeScript("return arguments[0].getAttribute('value')",element);
	System.out.println(t);
	return null;
}

public static void jsSetText(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor) driver;
	jk.executeScript("arguments[0].setAttribute('value','Naveen')",element);

}
public static void actionClass(WebElement element) throws AWTException {
Actions a =new Actions(driver);
//a.doubleClick(element).perform();
a.contextClick(element).perform();
//Robot r =new Robot();
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);
}
public static void mousehover(WebElement element) {
	Actions x =new Actions(driver);
	x.moveToElement(element).perform();
}
//public static void navigateBack(WebElement element) {
	//driver.navigate().back();

//}
public static String  getinput(WebElement element) {    // to get attribute value
	String att= element.getAttribute("value");
	System.out.println(att);
	return att;	
}
public static String gettext(WebElement element) {
	String t = element.getText();
	System.out.println(t);
	return t;
}
public static String  gettitle1() {
	String title = driver.getTitle();
	System.out.println(title);
	return title;
	

}
public static String  getUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
return currentUrl;
}
public static void close() {
	driver.close();

}
public static  void dropValue(WebElement element,String value) {
	Select s =new Select(element);
	s.selectByValue(value);
	
}
public static void dropVisible(WebElement element,String value) {
	Select s =new Select(element);
	s.selectByVisibleText(value);

}
public static String excelRead(String path,String sheetName,int rowNo,int cellNo) throws IOException {
	String value=null;
	
File f =new File(path);
FileInputStream fin =new FileInputStream(f);
Workbook w =new XSSFWorkbook(fin);
Sheet s = w.getSheet(sheetName);
Row r = s.getRow(rowNo);
Cell c = r.getCell(cellNo);
int cellType = c.getCellType();
System.out.println(cellType);

if(cellType == 1) {
value = c.getStringCellValue();
System.out.println(value);	
}
else if(cellType == 0) {
if(DateUtil.isCellDateFormatted(c)) {
	Date dateCellValue = c.getDateCellValue();
	SimpleDateFormat dateFormat =new SimpleDateFormat("dd/mm/yyyy");
	value = dateFormat.format(dateCellValue);
	System.out.println(value);
}else {
	double numericCellValue = c.getNumericCellValue();
	long l =(long) numericCellValue;
	value = String.valueOf(l);
	System.out.println(value);
}
}
return value;

}

public void excelWrite(String path,String sheetName,int rowNo,int cellNo,String data) throws IOException {
	File f =new File(path);
	FileInputStream fin =new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s = w.getSheet(sheetName);
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);	
	c.setCellValue(data);
	FileOutputStream fout =new FileOutputStream(f);
	w.write(fout);
}
}
