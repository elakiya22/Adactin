package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	
	public WebDriver driver;

@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotel;

@FindBy(id="room_type")
private WebElement roomtype;

@FindBy(id="room_nos")
private WebElement roomno;

@FindBy(id="datepick_in")
private WebElement checkin;

@FindBy(id="datepick_out")
private WebElement checkout;

@FindBy(id="adult_room")
private WebElement adultroom;

@FindBy(id="child_room")
private WebElement childrenroom;

@FindBy(id="Submit")
private WebElement submit;



public Search_hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomno() {
	return roomno;
}

public WebElement getCheckin() {
	return checkin;
}

public WebElement getCheckout() {
	return checkout;
}

public WebElement getAdultroom() {
	return adultroom;
}

public WebElement getChildrenroom() {
	return childrenroom;
}

public WebElement getSubmit() {
	return submit;
}



}
