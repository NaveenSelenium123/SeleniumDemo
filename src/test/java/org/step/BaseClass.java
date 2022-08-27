package org.step;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.it.Date;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;// instance
	public static  void browserConChrome() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

	}
	public static void openApplication(String url) {
	driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void browserClose() {
		driver.close();

	}
	public WebElement webElementLocateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public WebElement locateByXpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public WebElement locateByTagName(String tagName) {
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;
	}
	//element.sendkey("value")
	public static void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
			}
	public String excelRead(String path,String sheetName,int rowNo,int cellNo) throws IOException {
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
		java.util.Date dateCellValue = c.getDateCellValue();
		///Date dateCellValue = c.getDateCellValue();
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
