package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
public WebDriver driver;

@FindBy(id="first_name")
private WebElement firstname;

@FindBy(id="last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement adress;

@FindBy(xpath="(//input[@type='text'])[13]")
private WebElement cno;

@FindBy(id="cc_type")
private WebElement ctype;


@FindBy(id="cc_exp_month")
private WebElement cexpmonth;

@FindBy(id="cc_exp_year")
private WebElement cexpyear;

@FindBy(id="cc_cvv")
private WebElement cvv;


@FindBy(id="book_now")
private WebElement booknow;

public Bookhotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}


public WebElement getFirstname() {
	return firstname;
}


public WebElement getLname() {
	return lname;
}


public WebElement getAdress() {
	return adress;
}


public WebElement getCno() {
	return cno;
}


public WebElement getCtype() {
	return ctype;
}


public WebElement getCexpmonth() {
	return cexpmonth;
}


public WebElement getCexpyear() {
	return cexpyear;
}


public WebElement getCvv() {
	return cvv;
}


public WebElement getBooknow() {
	return booknow;
}







}
