package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Homepage {
	public WebDriver driver;

	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement loginbutton;

public Homepage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}




public WebDriver getDriver() {
	return driver;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbutton() {
	return loginbutton;
}


}
