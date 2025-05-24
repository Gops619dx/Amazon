package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.Base_Class;

public class ProductSearchPageModel extends Base_Class {

    @FindBy(xpath = "//xpath_to_mens_product")
    private WebElement men;

    @FindBy(xpath = "//xpath_to_jackets")
    private WebElement jacket;

    @FindBy(xpath = "//xpath_to_montana_jacket")
    private WebElement montana;

    @FindBy(xpath = "//xpath_to_xl_size")
    private WebElement size;

    @FindBy(xpath = "//xpath_to_colour")
    private WebElement colour;

    @FindBy(xpath = "//xpath_to_add_to_cart")
    private WebElement addToCart;

    public ProductSearchPageModel(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchPage() {
        implicitWait(10);
        clickElement(men);
        clickElement(jacket);
        clickElement(montana);
        clickElement(size);
        clickElement(colour);
        clickElement(addToCart);
    }

	private void clickElement(WebElement men2) {
		// TODO Auto-generated method stub
		
	}

	private void implicitWait(int i) {
		// TODO Auto-generated method stub
		
	}

	public void ProductSearchPageModel() {
		// TODO Auto-generated method stub
		
	}
}
