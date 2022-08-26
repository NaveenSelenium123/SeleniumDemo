package org.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Login1 extends BaseClass {
	public Login1() {
		PageFactory.initElements(driver,this);
	}
	@CacheLookup
@FindBys({
	@FindBy(id="email"),
	@FindBy(xpath="//input[@id='email']")
})	
private WebElement txtEmail;
	@CacheLookup	
@FindAll({
	@FindBy(id="pass"),
	@FindBy(id="password"),
})
private WebElement txtPass;
	@CacheLookup
@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}
}
