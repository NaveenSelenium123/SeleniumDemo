package org.com;

import org.adactin.BaseClassPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation4 extends BaseClassPom{
	public BookingConfirmation4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='gst']")
	private WebElement bookingConfirm;
	public WebElement getBookingConfirm() {
		return bookingConfirm;
	}
}
