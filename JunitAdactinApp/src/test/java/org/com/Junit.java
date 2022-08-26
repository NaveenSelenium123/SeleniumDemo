package org.com;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass {
	@Before
	public void beforeEachMethod() {
		browserConChrome();
		openApplication("http://www.adactin.com/HotelApp/");
		maximizeWindow();
	}
	@After
	public void afterEachMethod() throws InterruptedException {
		Thread.sleep(5000);
		browserClose();	
	}
	@Test
	public  void tc1() throws IOException {
		WebElement txtUserName  = webElementLocateById("username");
		inputText( txtUserName,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 7));
		WebElement txtPassword = webElementLocateById("password");
		inputText( txtPassword,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 6));
		WebElement btnLogin = webElementLocateById("login");
		click(btnLogin);
		WebElement btnLocation = webElementLocateById("location");
		dropDown(btnLocation,1);
		WebElement btnHotel  = webElementLocateById("hotels");
		dropDown(btnHotel,1);
		WebElement roomType = webElementLocateById("room_type");
		dropDown(roomType,1);
		WebElement adultRoom = webElementLocateById("adult_room");
		dropDown(adultRoom,1);
		WebElement childRoom   = webElementLocateById("child_room");
		dropDown(childRoom ,1);
		WebElement btnSubmit   = webElementLocateById("Submit");
		click(btnSubmit);
		WebElement radioButton   = webElementLocateById("radiobutton_0");
		click(radioButton);
		WebElement continue1   = webElementLocateById("continue");
		click(continue1);
		WebElement firstname  = webElementLocateById("first_name");
		inputText( firstname,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 1));
		WebElement lastname  = webElementLocateById("last_name");
		inputText( lastname,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 2));
		WebElement address = webElementLocateById("address");
		inputText( address,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 3));
		WebElement ccNo = webElementLocateById("cc_num");
		inputText( ccNo,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 1, 4));
		
		WebElement ccType = webElementLocateById("cc_type");
		dropDown(ccType ,1);
		WebElement expiryMonth = webElementLocateById("cc_exp_month");
		dropDown(expiryMonth ,1);
		WebElement expiryYear = webElementLocateById("cc_exp_year");
		dropDown(expiryYear ,12);
		WebElement cvvNo= webElementLocateById("cc_cvv");
		inputText(cvvNo,excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenFeb\\Folder\\TestData.xlsx","Adactin", 2, 5));
		WebElement book_now   = webElementLocateById("book_now");
		click(book_now);                 //order_no
		//WebElement textOrderNo = webElementLocateById("order_no");
		//javaScriptGetValue(textOrderNo);
		//getAttribute(textOrderNo);
		WebElement textOrderNo  = webElementLocateById("order_no");
		getAttribute(textOrderNo);
		
		
	}

}
