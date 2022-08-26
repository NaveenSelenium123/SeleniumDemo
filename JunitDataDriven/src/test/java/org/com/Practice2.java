package org.com;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Practice2 extends BaseClass {
	@Before
	public void beforeEachMethod() {
		browserConChrome();
		openApplication("http://www.facebook.com");
		maximizeWindow();		
	}
	@After
	public void afterEachMethod() throws InterruptedException {
		
		browserClose();		
	}
	@Test
	public void tc1() throws InterruptedException {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,"user1");
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,"test1");
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}
	@Test
	public void tc2() throws InterruptedException {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,"user2");
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,"test2");
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}
	@Test
	public void tc3() throws InterruptedException {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,"user3");
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,"test3");
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}
	@Test
	public void tc4() throws InterruptedException {
		
		WebElement txtEmail = webElementLocateById("email");
		inputText(txtEmail,"user4");
		WebElement txtPass = webElementLocateById("pass");
		inputText(txtPass,"test4");
		WebElement btnLogin = locateByName("login");
		click(btnLogin);
	}
	
	
	
}
