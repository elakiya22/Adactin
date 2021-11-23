package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation {

	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement myitinerary;
	
	@FindBy(id="logout")
	private WebElement logout;

	
		
		public WebElement getLogout() {
		return logout;
	}
		public WebDriver getDriver() {
			return driver;
	}
	public WebElement getMyitinerary() {
		return myitinerary;
	}

	public Bookingconfirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
