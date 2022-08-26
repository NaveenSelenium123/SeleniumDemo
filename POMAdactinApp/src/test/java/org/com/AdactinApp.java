package org.com;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class AdactinApp {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b =new BaseClass();
		b.browserConfigChrome();
		b.openApplication("http://www.adactin.com/HotelApp/");
		b.maximizeWindow();
		WebElement txtUser = b.locateById("username");
		b.inputText(txtUser,b.excelRead("E:\\projects\\POMAdactinApp\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 3, 1));
		WebElement txtPass = b.locateById("password");
		b.inputText(txtPass,b.excelRead("E:\\projects\\POMAdactinApp\\excel\\EXCEL AdactinApp.xlsx", "Sheet1", 3, 3));
		WebElement txtLogin = b.locateById("login");
		WebElement txtAdactin = b.locateByXpath("//td[contains(text(),'The best')]");
		String text = b.getText(txtAdactin);
		b.excelWrite("C:\\\\Users\\\\navee\\\\OneDrive\\\\Desktop\\\\MavenAdactinApp\\\\Folder\\\\EXCEL AdactinApp.xlsx", "Sheet1", 4, 2, text);
		 txtLogin.click();
		 
		 
		 
		 WebElement location= b.locateById("location");
		 
		b.dropDown(location, 3);
		WebElement btnHotels = b.locateById("hotels");
		b.dropDown(btnHotels, 3);
		WebElement roomType = b.locateById("room_type");
		b.dropDown(roomType, 2);
		WebElement roomnos = b.locateById("room_nos");
		b.dropDown(roomnos, 4);
		WebElement adultRoom= b.locateById("adult_room");
		b.dropDown(adultRoom, 3);
		WebElement childRoom = b.locateById("child_room");
		b.dropDown(childRoom, 2);
		WebElement search = b.locateById("Submit");
		search.click();
		WebElement radioButton = b.locateById("radiobutton_0");
		radioButton.click();
		WebElement continue1 = b.locateById("continue");
		continue1.click();
		WebElement firstName = b.locateById("first_name");
		//b.jk(firstName);
		
		b.inputText(firstName,b.excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1,1));
		
		WebElement lastName = b.locateById("last_name");
		b.inputText(lastName,b.excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1,2));
		
		WebElement address = b.locateById("address");
		b.inputText(address,b.excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1,3));
		
		WebElement ccNo = b.locateById("cc_num");
		b.inputText(ccNo,b.excelRead("C:\\Users\\navee\\OneDrive\\Desktop\\MavenAdactinApp\\Folder\\EXCEL AdactinApp.xlsx", "Adactin", 1,4));
		
		WebElement creditCardType= b.locateById("cc_type");
		b.dropDown(creditCardType, 2);
		WebElement expiryMonth= b.locateById("cc_exp_month");
		b.dropDown(expiryMonth, 3);
		WebElement expiryYear = b.locateById("cc_exp_year");
		b.dropDown(expiryYear, 12);
		WebElement cvvNo = b.locateById("cc_cvv");
		
		b.inputText(cvvNo,b.excelRead("C:\\\\Users\\\\navee\\\\OneDrive\\\\Desktop\\\\MavenAdactinApp\\\\Folder\\\\EXCEL AdactinApp.xlsx","Adactin",2,5));
		WebElement bookNow = b.locateById("book_now");
		bookNow.click();
		Thread.sleep(3000);
		//WebElement textOrderNo = b.locateById("order_no");
		//WebElement textOrderNo = b.locateByXpath("//input[@name='order_no']");
		//String text2 = b.getText(textOrderNo);
		//System.out.println(text2);
		WebElement locateById = b.locateById("username");
		b.actionClass(locateById);
}
}
