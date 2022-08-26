package org.com;

import org.adactin.BaseClassPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel3 extends BaseClassPom{
	public BookAHotel3() {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="first_name")	
private WebElement firstName;
@FindBy(id="last_name")
private WebElement lastName;
@FindBy(id="address")
private WebElement billingAddress;
@FindBy(id="cc_num")
private WebElement creditCardNo;
@FindBy(id="cc_type")
private WebElement creditCardType;
@FindBy(id="cc_exp_month")
private WebElement expyMonth;
@FindBy(id="cc_exp_year")
private WebElement expyYear;
@FindBy(id="cc_cvv")
private WebElement cvvNo;
@FindBy(id="book_now")
private WebElement bookNow;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getBillingAddress() {
	return billingAddress;
}
public WebElement getCreditCardNo() {
	return creditCardNo;
}
public WebElement getCreditCardType() {
	return creditCardType;
}
public WebElement getExpyMonth() {
	return expyMonth;
}
public WebElement getExpyYear() {
	return expyYear;
}
public WebElement getCvvNo() {
	return cvvNo;
}
public WebElement getBookNow() {
	return bookNow;
}

}
