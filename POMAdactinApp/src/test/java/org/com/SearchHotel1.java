package org.com;
import org.adactin.BaseClassPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel1 extends BaseClassPom {
	public SearchHotel1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	
}
