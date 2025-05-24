package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderModel {

    WebDriver driver;

     
    @FindBy(id = "payment-method")
    private WebElement paymentMethod;

    @FindBy(id = "place-order")
    private WebElement placeOrderButton;

    @FindBy(id = "order-confirmation")
    private WebElement orderConfirmationMessage;

    public PlaceOrderModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void completeOrder() {
        paymentMethod.click();           
        placeOrderButton.click();        
    }

    public String getOrderConfirmationText() {
        return orderConfirmationMessage.getText();   
    }
}
