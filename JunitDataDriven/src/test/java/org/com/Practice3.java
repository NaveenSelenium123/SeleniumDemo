package org.com;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
public class Practice3 extends BaseClass {
	@Before
	public void beforeEachMethod() {
		browserConChrome();
		openApplication("http://www.facebook.com");
		maximizeWindow();		
	}
	@After
	public void afterEachMethod()   {
		
		browserClose();		
	}
	@Test
	public void tc1() throws IOException {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx", "Sheet1", 3, 2));
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx", "Sheet1", 3, 2));
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}
	@Test
	public void tc2() throws IOException  {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,"user2");
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,"test2");
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
		
	}	
	
	
}
