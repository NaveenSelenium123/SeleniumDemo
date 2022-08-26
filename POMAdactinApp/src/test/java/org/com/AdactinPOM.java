package org.com;

import org.adactin.BaseClassPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPOM extends BaseClassPom {
	public   AdactinPOM() {
		PageFactory.initElements(driver, this);
	}
     @FindBy(id="username")
	private WebElement txtUserName;
     @FindBy(id="password")
	private WebElement txtPassword;
     @FindBy(id="login")
	private WebElement txtLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getTxtLogin() {
		return txtLogin;
	}
	
}
