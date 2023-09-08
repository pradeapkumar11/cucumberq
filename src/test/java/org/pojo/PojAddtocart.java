package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojAddtocart extends BaseClass{

	public PojAddtocart() {
		PageFactory.initElements(driver,this );
	}


@FindBy(xpath="(//button[contains(@class,'medium')])[3]")
private WebElement medium;

@FindBy(xpath="//div[text()='ADD TO CART']")
private WebElement addToCart;

@FindBy(xpath="//button[contains(@class,'checkout')]")
private WebElement cart;
}
