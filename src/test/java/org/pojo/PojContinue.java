package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojContinue  extends BaseClass{


	 public PojContinue() {
			PageFactory.initElements(driver,this);
		}



@FindBy(xpath="//input[@placeholder=\\\"Email\\\"]")
private WebElement email;

@FindBy(xpath="//input[@placeholder='First name']")
private WebElement fName;

@FindBy(xpath="//input[@placeholder='Last name']")
private WebElement LName;

@FindBy(xpath="//input[@placeholder='Address']")
private WebElement address; 

@FindBy(xpath="//input[@placeholder='Apartment, suite, etc. (optional)']")
private WebElement house;

@FindBy(xpath="//input[@placeholder='City']")
private WebElement city;

@FindBy(xpath="//select[@placeholder='State']")
private WebElement state;

@FindBy(xpath="//input[@placeholder='ZIP code']")
private WebElement zipcode ;

@FindBy(xpath="//button[@id=\\\"continue_button\\\"]")
private WebElement cont1;
}
