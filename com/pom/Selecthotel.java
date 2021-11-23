package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
public WebDriver driver;

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(id="continue")
private WebElement clickcontinue;

public WebDriver getDriver() {
	return driver;
}

public WebElement getRadio() {
	return radio;
}

public WebElement getClickcontinue() {
	return clickcontinue;
}
public Selecthotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);

}
}
