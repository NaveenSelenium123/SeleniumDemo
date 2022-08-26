package org.testone;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Facebook1 extends BaseClass1 {
	public static void main(String[] args) throws IOException {
		BaseClass1 b =new BaseClass1();
		//browser configuration
		b.browserConChrome();
		
		//open any application
		b.openApplication("https://www.facebook.com");
		
		//maximize window
		
		b.maximizeWindow();
		
		//Locate the Email TextBox
		WebElement txtEmail = b.webElementLocateById("email");
		
		//pass input data to text box
		b.inputText(txtEmail,b.excelRead("E:\\projects\\DataDrivenExecelBaseClass\\ExcelFolder\\Book1.xlsx","Sheet1" ,3, 1));
		
		//Locate the password textbox
		
		WebElement txtPass = b.webElementLocateById("pass");
		
		//pass input data  to textbox
		
		b.inputText(txtPass,b.excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Sheet1", 3, 3)); 
		
		//Locate the login button
		WebElement btnLogin = b.locateByName("login");
		WebElement txtFacebook = b.locateByXpath("//h2[contains(text(),'Face')]");
		String text = b.getText(txtFacebook);
		b.excelWrite("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx", "Sheet1", 4, 2, text);
		//click the login button
		
		btnLogin.click();
	}

}
