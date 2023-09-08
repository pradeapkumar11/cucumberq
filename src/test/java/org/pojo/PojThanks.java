package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojThanks extends BaseClass{


	 public PojThanks() {
			PageFactory.initElements(driver,this );
		}



@FindBy(xpath="//button[@id=\\\"continue_button\\\"]")
private WebElement cont2;
}
