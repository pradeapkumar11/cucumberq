package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends BaseClass{

	
public Pojo1() {
	PageFactory.initElements(driver,this );
}

@FindBy(xpath="//span[text()='Sign in']")
private WebElement signin;

public WebElement getSignin() {
	return signin;
}



}
