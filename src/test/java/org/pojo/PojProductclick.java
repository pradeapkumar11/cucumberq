package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojProductclick extends BaseClass{
	 

		 public PojProductclick() {
				PageFactory.initElements(driver,this );
			}

		 @FindBy(xpath="(//div[@class='productCard-module--buttonsWrapper--634dc'])[1]")
		 private WebElement pdt;

		 
}
