package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojSign1 extends BaseClass {

	public PojSign1() {
		PageFactory.initElements(driver,this );
	}



@FindBy(xpath="//button[text()='ACCEPT ALL COOKIES']")
private WebElement cookies;

@FindBy(xpath="//input[@name='username']")
private WebElement username;

@FindBy(xpath="//input[@name='password']")
private WebElement password;

@FindBy(xpath="//button[@black='0']")
private WebElement login;

public WebElement getCookies() {
	return cookies;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}
}