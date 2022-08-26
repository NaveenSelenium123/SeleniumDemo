package org.test;

import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass {
	public static void main(String[] args) {
	BaseClass b =new BaseClass();
	b.browserConfigChrome();
	b.openApplication("https://www.facebook.com");
	b.maximizeWindow();
	WebElement txtEmail= b.locateById("email");
	b.inputText(txtEmail,"welcome");
	WebElement txtPass = b.locateById("pass");
b.inputText(txtPass, "testing");
WebElement btnLogin = b.locateByName("login");
btnLogin.click();
}
}