 package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingElementModel {

    WebDriver driver;

     
    @FindBy(id = "shipping-method")
    private WebElement shippingMethodDropdown;

    @FindBy(id = "terms")
    private WebElement termsCheckbox;

    @FindBy(id = "continue-to-payment")
    private WebElement continueButton;

    public ShippingElementModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getShippingElement() {
         
        shippingMethodDropdown.click();  
        termsCheckbox.click();
        continueButton.click();
    }
}
