package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Facebook1 {
	public static void main(String[] args) throws IOException {
		BaseClass b =new BaseClass();
		b.browserConfigChrome();
		b.openApplication("https://www.facebook.com");
		b.maximizeWindow();
		
		WebElement txtEmail= b.locateById("email");
		b.inputText(txtEmail,b.excelRead("E:\\projects\\DataDrivenExecelBaseClass\\ExcelFolder\\Book1.xlsx","Sheet1",2,1));
		WebElement txtPass= b.locateById("pass");
		b.inputText(txtPass,b.excelRead("E:\\\\projects\\\\DataDrivenExecelBaseClass\\\\ExcelFolder\\\\Book1.xlsx","Sheet1",3,3));
		WebElement btnLogin = b.locateByName("login");
		WebElement txtFacebook = b.locateByXpath("//h2[contains(text(),'Face')]");
		String text = b.getText(txtFacebook);
		b.excelWrite("E:\\\\projects\\\\DataDrivenExecelBaseClass\\\\ExcelFolder\\\\Book1.xlsx","Sheet1", 2,3,text);
		btnLogin.click();
		
	}

}
