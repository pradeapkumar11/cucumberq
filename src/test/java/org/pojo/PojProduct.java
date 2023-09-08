package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojProduct extends BaseClass {

 public PojProduct() {
		PageFactory.initElements(driver,this );
	}

 @FindBy(xpath="//div[text()='Men']")
 private WebElement men;
 	
 @FindBy(xpath="/html/body/div[1]/div[1]/div/header/div[2]/div/div[5]/a/div[2]/div[1]/div[3]/section/a[1]")
 private WebElement sweater;

}
